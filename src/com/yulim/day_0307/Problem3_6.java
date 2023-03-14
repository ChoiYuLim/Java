package com.yulim.day_0307;

public class Problem3_6 {

    public static void main(String[] args) {
        System.out.println("[숫자 맞추기 게임]");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0 ~ 9 사이의 숫자를 입력 하세요");
            int num = new java.util.Scanner(System.in).nextInt();
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
