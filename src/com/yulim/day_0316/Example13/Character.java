package com.yulim.day_0316.Example13;

public abstract class Character {
    String name;
    int hp;

    public abstract void attack(Monster monster);

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void run() {
        System.out.println(name + "은 도망쳤다");
    }
}
