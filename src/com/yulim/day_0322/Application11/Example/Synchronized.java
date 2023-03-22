package com.yulim.day_0322.Application11.Example;

public class Synchronized {
	int a = 0;
	int b = 0;

	void syncExam() {
		System.out.println("시작");

		synchronized (this) {
			a += 2;
			b = a * 4;

		}

		System.out.println("끝");
	}

	public static void main(String[] args) {
		Synchronized sync = new Synchronized();
		sync.syncExam();
		System.out.println(sync.a + " " + sync.b);
	}

}
