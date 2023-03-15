package com.yulim.day_0313;

import java.util.Random;

public class Cleric {
    String name;

    final int MAX_HP = 50;
    int hp = MAX_HP;

    final int MAX_MP = 10;
    int mp = MAX_MP;

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
// 최유림 바보
// 최유림 바보
// 최유림 바보
// 최유림 메롱
// 최유림 메에롱
