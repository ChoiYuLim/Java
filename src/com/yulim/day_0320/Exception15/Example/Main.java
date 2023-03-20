package com.yulim.day_0320.Exception15.Example;

public class Main {
    public static void main(String[] args) {
        try {
            int[] nums = {0, 1, 2};
            nums[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("에러 발생");
        }
    }
}
