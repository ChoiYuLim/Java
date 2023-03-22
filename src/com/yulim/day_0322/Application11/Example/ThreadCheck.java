package com.yulim.day_0322.Application11.Example;

import java.util.Scanner;

public class ThreadCheck {
	public static void main(String[] args) {

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + " " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + " " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + " " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

}
