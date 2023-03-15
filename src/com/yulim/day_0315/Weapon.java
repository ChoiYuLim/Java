package com.yulim.day_0315;

public class Weapon extends Item { // 서브 클래스, 슈퍼 클래스

    public Weapon(String name) {
        super(name);
    }

    public Weapon(String name, int price) {
        super(name, price);
    }
}
