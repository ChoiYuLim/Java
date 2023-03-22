package com.yulim.day_0322.Application11.Problem;

public class CountUpThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + "의 " + i);
		}
	}
}