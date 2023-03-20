package com.yulim.day_0316.application.Example3.Clone;

public class Hero implements Cloneable {
	public String name;
	public int hp;
	public Sword sword;

	@Override
	public Hero clone() {
		Hero result = new Hero(name);
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}

	public Hero(String name) {
		this.name = name;
		Sword sw = new Sword();
		sword = sw;
	}

}
