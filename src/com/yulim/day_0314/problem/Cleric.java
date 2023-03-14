package com.yulim.day_0314.problem;

import java.util.Random;

public class Cleric {
    String name;

    final static int MAX_HP = 50;
    int hp = MAX_HP;

    final static int MAX_MP = 10;
    int mp = MAX_MP;

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }

    Random random = new Random();

    void selfAid() {
        this.mp -= 5;
        this.hp = MAX_HP;
    }

    int pray(int sec) {
        int initMP = this.mp;
        int recovery = random.nextInt(3) + sec;

        mp += recovery;
        mp = Math.min(mp, MAX_MP);

        return mp - initMP;
    }

}
