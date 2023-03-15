package com.yulim.day_0315.Example12;

public class Dancer extends Character implements Human, Job { // dancer는 character야, dancer는 human이야

	public Dancer(String name) {
		super(name);
	}

	public void dance() {
		System.out.println(this.name + "은 정열적으로 춤을 췄다");
	}

	@Override
	public void attack(Kinoko kinoko) {
		// TODO Auto-generated method stub

	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub

	}
}
