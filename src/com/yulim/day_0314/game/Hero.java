package com.yulim.day_0314.game;

public class Hero {
    String name;
    int hp;

    Sword sword;
    public static int MONEY;

    // 기본 생성자 primary constructor -> new를 했을 때 제일 처음 옴
    public Hero() {
        name = "noname";
        hp = 100;
    }

    Hero(String name) {
        this.name = name; // this : 클래스 안에 필드를 가리킴
        hp = 100;
        sword = new Sword();
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

    static void setRandomMoney() {
        // static이 붙어있는 애들끼리만 메모리 영역을 공유함
        // static은 static 자원에만 접근이 된다,,?
        Hero.MONEY = (int) (Math.random() * 1000); // 공동의 자산 셋팅하는 메소드
    }

}
