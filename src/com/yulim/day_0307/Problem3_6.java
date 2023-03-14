package com.yulim.day_0307;

import java.util.Random;
import java.util.Scanner;

public class Problem3_6 {

    public static void main(String[] args) {
        System.out.println("[숫자 맞추기 게임]");
        int ans = new Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0 ~ 9 사이의 숫자를 입력 하세요");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == ans) {
                System.out.println("정답!");
                break;
            } else {
                System.out.println("다릅니다");
            }
        }
        System.out.println("게임을 종료합니다");
    }
}
