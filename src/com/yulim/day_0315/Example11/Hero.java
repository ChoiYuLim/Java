package com.yulim.day_0315.Example11;

// 싸우기와 도망만 되는 Hero 클래스

public class Hero {

	public Hero() {
		System.out.println("Hero 생성자");
	}

	private String name = "최유림";
	private int hp = 100;

	public String getName() {
		return name;
	}

	// 싸우기
	public void attack(Kinoko enemy) {
		System.out.println(this.name + "의 공격!");
		this.hp -= 5;
		System.out.println("5포인트의 데미지를 주었다!");
	}

	public final void slip() {
		hp -= 5;
		System.out.println(name + "는 미끄러졌다!");
		System.out.println("5의 데미지!");
	}

	// 도망
	public void run() {
		System.out.println(this.name + "는 도망쳤다!");
	}
}
