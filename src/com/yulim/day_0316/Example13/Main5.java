package com.yulim.day_0316.Example13;

// 몬스터로 퉁치면, Slime, Kinoko, Monster를 받았을 때 각각 오버라이드해서 재정의한 run으로 실행

public class Main5 {

    public static void main(String[] args) {
        // 타입은 Monster로 퉁치기
        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime();
        monsters[1] = new Kinoko();
        monsters[2] = new Monster();

        // 동작은 안에 담긴 객체를 따름
        for (Monster monster : monsters) {
            monster.run();
        }
    }

}
