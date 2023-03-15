package com.yulim.day_0308;

public class Example {
    public static void main(String[] args) {
        // int[] scores = {20, 30, 50, 80, 93};
        //
        // int sum = 0;
        // for (int i = 0; i < scores.length; i++) {
        // sum += scores[i];
        // }
        //
        // for (int score : scores) {
        // sum += score;
        // }
        //
        // double average = sum / scores.length;
        //
        // System.out.println("총점: " + sum);
        // System.out.println("평균: " + average);

        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 100;
        System.out.println(a[0]);
        
        double[] d = new double[3];
        System.out.println(d[0]);

    }
}
