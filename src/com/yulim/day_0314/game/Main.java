package com.yulim.day_0314.game;

import com.yulim.day_0314.game.Hero;

public class Main {

    public static void main(String[] args) {
        // 가상 세계에 용사를 생성
        Hero hero = new Hero();

        // 생성된 용사에게 최초의 HP와 이름을 설정
        hero.name = "유림";
        hero.hp = 100;
        System.out.println("용사 " + hero.name + " 을 생성했습니다!");
        

        // 용사에게 '5초 앉기', '넘어지기', '25초 앉기', '도망'을 지시
        hero.sit(5);
        hero.slip();
        hero.sit(25);
        hero.run();
    }

}
