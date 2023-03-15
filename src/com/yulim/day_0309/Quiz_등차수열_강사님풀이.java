package com.yulim.day_0309;

import java.util.Scanner;

public class Quiz_등차수열_강사님풀이 {

    // main에 입력과 출력은 있어도 됨
    // 해결 로직은 따로 빼기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] results = solution2(m, n);

        for (int i = 0; i < results.length; i++) {
            if (i == results.length - 1) {
                System.out.println(results[i]);
            } else {
                System.out.print(results[i] + " ");
            }
        }
    }

    public static int[] solution2(int m, int n) {
        int[] results = new int[10];
        results[0] = m;
        for (int i = 0; i < results.length; i++) {
            results[i] = m + n * i;
        }
        return results;
    }

}
