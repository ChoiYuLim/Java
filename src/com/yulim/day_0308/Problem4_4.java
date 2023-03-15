package com.yulim.day_0308;

import java.util.Scanner;

public class Problem4_4 {
    // 다음 4개의 조건에 맞는 “숫자 맞추기 퀴즈" 프로그램을 작성 하시오.
    public static void main(String[] args) {
        // 3개짜리 int형 배열 numbers를 준비하시오. 이 때 초기화는 각각 3, 4, 9 로 합니다.
        int[] numbers = {3, 4, 9};

        // 화면에 “1자리의 숫자를 입력 해 주세요" 라고 표시합니다
        System.out.println("1자리의 숫자를 입력 해 주세요");

        // 다음 코드를 사용해 키보드로부터 숫자를 입력 받아, 변수 input 에 대입합니다
        int input = new Scanner(System.in).nextInt();

        // input값이 3, 4, 9 중 하나와 같다면 “정답!” 이라고 표시합니다.
        for (int number : numbers) {
            if (number == input) {
                System.out.println("정답!");
                return;
            }
        }
    }
}
