package com.yulim.day_0322.Application11.Example;

import java.util.Scanner;

// 1. 스레드 사용하는 예
class PrintingThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}


class PrintingProcess implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}


public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("키 입력");
        Scanner scanner = new Scanner(System.in);

        new PrintingThread().start();

        new Thread(new PrintingProcess()).start();

        // 무명 클래스 사용하는 방법
        new Thread(new Runnable() {

            @Override
            public void run() {

            };
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(50);
                    System.out.println("Thread : " + Thread.currentThread().getName());
                    // sb.append(i);
                } catch (Exception e) {

                }
            }
        }).start();

        // 람다식 사용하는 방법
        new Thread(() -> System.out.println("")).start();

        scanner.nextLine();
    }

}
