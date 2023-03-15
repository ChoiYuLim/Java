package com.yulim.day_0308;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        try {
            int size = sc.nextInt();
            if (size == 0) {
                System.out.println("0을 입력했으므로 종료합니다.");
                return;
            }
            // 버퍼 비우기
            //sc.nextLine();

            String strName = "Hello ";

            for (int i = 0; i < size; i++) {
                String name = new java.util.Scanner(System.in).nextLine(); //이렇게 쓰지마라!!! 진짜 몇시간 해봤는데 이유는 모름 몰라도 된대
                strName += name;

                int lastIndex = size - 1;
                if (i == lastIndex) {
                    strName += ".";
                } else {
                    strName += ",";
                }
            }
            System.out.println(strName);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아니므로 종료됩니다.");
        }

    }

}
