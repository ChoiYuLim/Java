package com.yulim.day_0316.Example13;

public class Hero extends Character{
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
    public void attack(Kinoko kinoko) {
        // TODO Auto-generated method stub
        
    }
    
    

}
