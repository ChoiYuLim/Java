package com.yulim.day_0309;

import java.util.Scanner;

public class Quiz_등차수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = solution(m, n);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                return;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] solution(int m, int n) {
        int[] arr = new int[10];
        arr[0] = m;
        for (int i = 0; i < 9; i++) {
            arr[i + 1] = arr[i] + n;
        }
        return arr;
    }

    
}
