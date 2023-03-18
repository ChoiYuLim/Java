package com.yulim.day_0317;

// 제네릭을 사용한 코드

public class Pocket_Generic<E> {
	private E data;

	public void put(E data) {
		this.data = data;
	}

	public E get() {
		return this.data;
	}
}