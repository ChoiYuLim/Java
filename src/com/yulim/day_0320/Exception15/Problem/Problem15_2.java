package com.yulim.day_0320.Exception15.Problem;

public class Problem15_2 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("---- stack trace (여기부터) ----");
            e.printStackTrace();
            System.out.println("---- stack trace (여기까지) ----");
        }

    }
}
