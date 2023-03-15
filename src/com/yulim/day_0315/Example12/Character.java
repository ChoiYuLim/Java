package com.yulim.day_0315.Example12;

import com.yulim.day_0313.game.Kinoko;

public abstract class Character {
    String name;
    int hp;
    
    public Character(String name) {
        this.name = name;
        this.hp = 100;
    }
    
    public void run() {
        System.out.println(name +"은 도망쳤다");
    }
    
    public abstract void attack(Kinoko kinoko);
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
}
