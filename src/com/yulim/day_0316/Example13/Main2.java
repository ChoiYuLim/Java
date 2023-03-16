package com.yulim.day_0316.Example13;

public class Main2 {
    public static void main(String[] args) {
        Slime slime = new Slime();
        Monster monster = slime;
        //Monster monster = new Slime();
        slime.run();
        monster.run();
       
    }
}
