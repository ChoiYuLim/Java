package com.yulim.day_0310;

public class Problem6_2 {

    public static void main(String[] args) {
        solution(2, 9);
    }

    public static void solution(int start, int end) {
        for (int i = 1; i < 10; i++) {
            for (int j = start; j <= end; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, i * j);
            }
            System.out.println();
        }
    }


}
