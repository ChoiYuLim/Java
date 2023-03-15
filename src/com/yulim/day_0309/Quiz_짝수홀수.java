package com.yulim.day_0309;

import java.util.Scanner;

public class Quiz_짝수홀수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(solution(N, M));
    }

    public static String solution(int N, int M) {
        if ((N + M) % 2 == 1) {
            return "YES";
        }
        return "NO";
    }
}

