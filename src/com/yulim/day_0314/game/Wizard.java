package com.yulim.day_0314.game;

public class Wizard {

    String name;
    int hp;
    
    void heal(Hero hero) {
        hero.hp += 10;
        System.out.println(hero.name + "의 HP를 10 회복했다!");
    }

}
