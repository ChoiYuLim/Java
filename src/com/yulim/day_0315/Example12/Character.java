package com.yulim.day_0315.Example12;

public abstract class Character {

	public Character(String name) {
		this.name = name;
		this.hp = 100;
	}

	String name;
	int hp;

	// 도망
	public void run() {
		System.out.println(name + "은 도망쳤다");
	}

	// 싸우기
	public abstract void attack(Kinoko kinoko);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
