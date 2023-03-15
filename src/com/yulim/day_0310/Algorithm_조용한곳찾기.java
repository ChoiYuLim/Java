package com.yulim.day_0310;

import java.util.Scanner;

public class Algorithm_조용한곳찾기 {

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

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            double distance = Math.sqrt((x[i] - a) * (x[i] - a) + (y[i] - b) * (y[i] - b));
            if (distance >= R)
                System.out.println("silent");
            else
                System.out.println("noisy");
        }

    }
}
