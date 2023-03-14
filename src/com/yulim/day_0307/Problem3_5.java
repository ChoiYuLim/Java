package com.yulim.day_0307;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem3_5 {

    public static void main(String[] args) {
        System.out.print("[메뉴] 1:검색 2:등록 3:삭제 4:변경 >");
        Scanner sc = new java.util.Scanner(System.in);

        try {
            int selected = sc.nextInt();
            switch (selected) {
                case 1:
                    System.out.println("검색합니다");
                    break;

                case 2:
                    System.out.println("등록합니다");
                    break;

                case 3:
                    System.out.println("삭제합니다");
                    break;

                case 4:
                    System.out.println("변경합니다");
                    break;

                default:
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자 형식이 아닌 문자열입니다.");
        }

    }

}
