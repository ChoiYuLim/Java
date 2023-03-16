package com.yulim.day_0316.Problem13;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Y> arrList = new ArrayList<Y>();
		arrList.add(new A());
		arrList.add(new B());

		for (Y y : arrList) {
			y.b();
		}
	}
}
