package com.yulim.day_0320.Exception15.Example;

public class Throws {

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] ar) {
        int a = 10;
        int b = 0;

        divide(a, b);
    }
}
