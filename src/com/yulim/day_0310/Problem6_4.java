package com.yulim.day_0310;

import java.util.Random;
import java.util.Scanner;

public class Problem6_4 {

    public static void main(String[] args) {

        System.out.println("던질 횟수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        long tries = scanner.nextLong();
        int hits = 0;

        for (int i = 0; i < tries; i++) {
            double x = new Random().nextDouble() * 2 - 1.0;
            double y = new Random().nextDouble() * 2 - 1.0;

            double distance = Math.sqrt(x * x + y * y);

            if (distance <= 1)
                hits++;
        }
        double piEstimate = 4 * hits / (double) tries;

        System.out.println(piEstimate);
    }

}
