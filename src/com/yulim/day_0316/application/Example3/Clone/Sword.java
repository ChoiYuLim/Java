package com.yulim.day_0316.application.Example3.Clone;

public class Sword implements Cloneable {

	String name;
	int damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public Sword clone() {
		Sword result = new Sword();
		result.setName(this.name);
		result.setDamage(this.damage);
		return result;
	}
}
