package com.yulim.day_0322.Application11.Problem;

public class Counter {
	private long count = 0;

	public void add(long i) {
		System.out.println("더하기");
		count += i;
	}

	public void mul(long i) {
		System.out.println("곱하기");
		count *= i;
	}

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		for (int i = 0; i < 3; i++) {
			try {
				new Thread(() -> {
					counter.add(5);
					counter.mul(3);
				}).start();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

		Thread.sleep(10);
		System.out.println(counter.count);
	}

}
