package com.yulim.day_0316.Example13;

public class Hero extends Character {
    String name;
    int hp = 50;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack(Monster monster) {
        System.out.println(this.name + "의 공격!");
        System.out.println("적에게 10포인트의 데미지를 주었다!");
        monster.setHp(monster.getHp() - 10);

    }



}
