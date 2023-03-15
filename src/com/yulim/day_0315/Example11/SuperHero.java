package com.yulim.day_0315.Example11;

public class SuperHero {
	private String name = "최유림";
	private int hp = 100;
	private boolean flying; // 필드 추가

	// 싸우기
	public void attack(Kinoko enemy) {
		System.out.println(this.name + "의 공격!");
		this.hp -= 5;
		System.out.println("5포인트의 데미지를 주었다!");
	}

	// 도망
	public void run() {
		System.out.println(this.name + "는 도망쳤다!");
	}

	// 날기
	public void fly() {
		flying = true;
		System.out.println("날았다!");
	}

	// 착지
	public void land() {
		flying = false;
		System.out.println("착지했다!");
	}
}
