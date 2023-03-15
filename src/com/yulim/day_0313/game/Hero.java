package com.yulim.day_0313.game;

public class Hero {
    // field variable
    // global variable
    // member variable
    // property

    String name;
    int hp = 50;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void attack() {}

    void run() {
        System.out.println(this.name + "은 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는 " + this.hp + "입니다");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "은 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "은 넘어졌다!");
        System.out.println("5의 데미지!");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }

}
