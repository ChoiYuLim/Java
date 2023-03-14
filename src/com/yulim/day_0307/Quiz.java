package com.yulim.day_0307;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int size = sc.nextInt();
            if (size == 0) {
                System.out.println("0을 입력했으므로 종료합니다.");
                return;
            }
            
            // 버퍼 비우기
            sc.nextLine();

            String strName = "Hello ";

            for (int i = 0; i < size; i++) {
                String name = sc.nextLine();
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
