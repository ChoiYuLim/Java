package com.yulim.day_0315.Problem11;

import com.yulim.day_0313.game.Hero;

public class Main {

    public static void main(String[] args) {
        PoisonKinoko poisonKinoko = new PoisonKinoko('A');
        Hero hero = new Hero();
        poisonKinoko.attack(hero);
    }

}
