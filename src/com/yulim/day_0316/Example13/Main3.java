package com.yulim.day_0316.Example13;

public class Main3 {
    public static void main(String[] args) {
        Character character = new Wizard();

        if (character instanceof Hero) {
            Hero hero = (Hero) character;

        } else {
            System.out.println("형변환 불가");
        }
    }
}
