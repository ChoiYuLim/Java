package com.yulim.day_0308;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        try {
            int size = sc.nextInt();
            if (size == 0) {
                System.out.println("0을 입력했으므로 종료합니다.");
                return;
            }

            // 버퍼 비우기
            sc.nextLine();

            String[] names = new String[size];

            for (int i = 0; i < size; i++) {
                String name = sc.nextLine();

                if (i == size - 1) {
                    names[i] = name + '.';
                } else {
                    names[i] = name + ',';
                }
            }

            System.out.print("Hello ");

            for (String name : names) {
                System.out.print(name);
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아니므로 종료됩니다.");
        }
    }

}
