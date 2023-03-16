package com.yulim.day_0316.Example13;

public class Kinoko extends Monster {
    public Kinoko() {
        super();
    }

    private int hp = 50;
    private char suffix;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public Kinoko(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero hero) {
        System.out.println("키노코 " + this.suffix + " 의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }
    
    @Override
    public void run() {
        System.out.println("Kinoko는 도망쳤다");
    }
}
