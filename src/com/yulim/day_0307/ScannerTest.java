package com.yulim.day_0307;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단어를 입력하세요: ");
        String word = scanner.next();
        System.out.println("입력한 단어: " + word);
        scanner.nextLine();

        System.out.println("문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("입력한 문장: " + sentence);
    }

}
