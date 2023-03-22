package com.yulim.day_0322.Application11.Example;

public class DeadLock {
	public static void main(String[] args) {
		final String resource1 = "resource1";
		final String resource2 = "resource2";

		Thread thread1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1: locked resource 1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2: locked resource 1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		});
		thread1.start();
		thread2.start();
	}
}
