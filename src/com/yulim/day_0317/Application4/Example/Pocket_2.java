package com.yulim.day_0317.Application4.Example;

// 이용 가능한 타입에 제약을 추가한 클래스

public class Pocket_2<E extends Character> {

	private E data;

	public void put(E data) {
		this.data = data;
	}

	public E get() {
		return this.data;
	}

}
