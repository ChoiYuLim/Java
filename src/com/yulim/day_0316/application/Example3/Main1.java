package com.yulim.day_0316.application.Example3;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();

		Hero hero = new Hero();
		hero.setName("홍길동");
		list.add(hero);
		System.out.println(list.size());

		hero = new Hero();
		hero.setName("홍길동");
		list.remove(hero);
		System.out.println(list.size());
	}
}
