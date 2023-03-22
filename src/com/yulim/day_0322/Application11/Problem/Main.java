package com.yulim.day_0322.Application11.Problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Thread thread1 = new CountUpThread();
		Thread thread2 = new CountUpThread();
		Thread thread3 = new CountUpThread();

		List<Thread> threads = new ArrayList<>();

		threads.add(thread1);
		threads.add(thread2);
		threads.add(thread3);

		threads.stream().forEach(e -> e.start());

	}
}
