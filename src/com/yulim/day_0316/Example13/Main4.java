package com.yulim.day_0316.Example13;

// 다형성의 메리트: 동일한 타입으로 취급

public class Main4 {

    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Hero();
        characters[1] = new Hero();
        characters[2] = new Hero();
        characters[3] = new Wizard();
        characters[4] = new Wizard();

        // 모험 개시!
        // 우선 여관에 머물기
        for (Character character : characters) {
            character.setHp(character.getHp() + 50);
        }

    }

}
