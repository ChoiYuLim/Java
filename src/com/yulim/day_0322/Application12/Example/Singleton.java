package com.yulim.day_0322.Application12.Example;

// DCL: 인스턴스가 null일 경우에만 동기화를 적용하여 인스턴스 생성
// 멀티 스레드 환경에서 안전하게 사용할 수 있는 방법

public class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void doSomething() {
// ...
	}
}