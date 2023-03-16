package com.yulim.day_0316.Example13;

// Wizard는 Character를 상속받기 때문에, name, hp, attack, run 모두 가짐, 추가로 mp와 fireball 메소드 가짐
// Character의 attack은 추상 메소드로 구현이 아직 안돼서 Wizard에서 오버라이드해서 재정의함

public class Wizard extends Character {

    int mp;

    @Override
    public void attack(Monster monster) {
        System.out.println(this.name + "의 공격!");
        System.out.println("적에게 3포인트의 데미지");
        monster.setHp(monster.getHp() - 3);
    }

    public void fireball(Kinoko kinoko) {
        System.out.println(this.name + "는 불의 구슬을 맞았다!");
        System.out.println("적에게 20포인트의 데미지");
        kinoko.setHp(kinoko.getHp() - 20);
        this.mp -= 5;
    }
}
