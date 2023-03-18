package com.yulim.day_0317.Application4.Problem;

public class StrongBox<E> {

	// 금고 클래스에 담는 인스턴스의 타입은 미정
	private E thing;

	// put 메서드로 인스턴스를 저장
	public void put(E thing) {
		this.thing = thing;
	}

	// get 메서드로 인스턴스를 얻을 수 있음
	public E get() {
		return this.thing;
	}

}
