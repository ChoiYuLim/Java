package com.yulim.day_0321.Application5.Example;

import java.util.function.IntBinaryOperator;

public class Main {
	public static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		IntBinaryOperator func = Main::add;

		int result = func.applyAsInt(5, 3);
		System.out.println("5 + 3 = " + result);
	}

}
