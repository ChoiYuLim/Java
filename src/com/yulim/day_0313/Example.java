package com.yulim.day_0313;

public class Example {

    public static void main(String[] args) {
        Cleric cleric = new Cleric();
        cleric.name = "최유림";
        System.out.println(cleric.name + "의 처음 mp값: " + cleric.mp);
        System.out.println("4초간 기도합니다.");
        System.out.println("실제로 회복된 mp값: " + cleric.pray(4));
        System.out.println("회복 이후의 mp값: " + cleric.mp);
    }

}
