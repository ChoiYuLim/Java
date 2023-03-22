package com.yulim.day_0322.Application11.Example;

public class Synchronized {
	int a = 0;
	int b = 0;

	// 1. synchronized 블록에 의한 방법
	void syncExam() {
		System.out.println("시작");

		synchronized (this) {
			a += 2;
			b = a * 4;

		}

		System.out.println("끝");
	}

	// 2. synchronized 키워드에 의한 방법
	public synchronized void syncExam2() {
		a += 2;
		b = a * 4;
	}

	public static void main(String[] args) {
		Synchronized sync = new Synchronized();
		sync.syncExam();
		System.out.println(sync.a + " " + sync.b);
	}

}
