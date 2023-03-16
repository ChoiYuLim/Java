package com.yulim.day_0316.Example13;

public class Main1 {

    public static void main(String[] args) {
        Wizard w = new Wizard();
        Kinoko k = new Kinoko();
        Monster m = new Monster();
        w.name = "레이나";
        w.attack(m);
        w.fireball(k);
    }
}
