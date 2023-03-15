package com.yulim.day_0315.Example11;

// Hero 클래스를 상속한 SuperHero
public class SuperHero extends Hero{
	
	private boolean flying; // 추가한 필드

	// 추가한 메소드
	public void fly() {
		flying = true;
		System.out.println("날았다!");
	}

	// 추가한 메소드
	public void land() {
		flying = false;
		System.out.println("착지했다!");
	}
}
