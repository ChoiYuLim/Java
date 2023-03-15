package com.yulim.day_0315.Example11;

// Hero 클래스를 상속한 SuperHero
public class SuperHero extends Hero {

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

	@Override
	public void run() {
		System.out.println("퇴각했다");
	}

	@Override
	public void attack(Kinoko enemy) {
		System.out.println(this.getName() + "의 공격!");
		enemy.hp -= 5;
		System.out.println("5포인트의 데미지를 주었다!");

		if (this.flying) {
			System.out.println(this.getName() + "의 공격!");
			enemy.hp -= 5;
			System.out.println("5포인트의 데미지를 주었다!");

		}
	}

}
