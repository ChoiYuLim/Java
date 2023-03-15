package com.yulim.day_0310;

import java.util.Scanner;

public class Refactor_조용한곳찾기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int R = sc.nextInt();
        int N = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];


        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (double distance : getDistance(N, x, y, a, b)) {
            System.out.println((getResult(distance, R)));
        }
    }

    public static double[] getDistance(int N, int[] x, int[] y, int a, int b) {
        double[] distances = new double[N];
        for (int i = 0; i < N; i++) {
            distances[i] = Math.sqrt((x[i] - a) * (x[i] - a) + (y[i] - b) * (y[i] - b));
        }
        return distances;
    }

    public static String getResult(double distance, int R) {
        if (distance >= R)
            return "silent";
        else
            return "noisy";
    }
}
