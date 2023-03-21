package com.yulim.day_0321.Application5.Example;

interface MyFunction {
	int call(int a, int b);
}

public class Main2 {
	public static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		MyFunction func = Main2::add;

		int result = func.call(3, 4);
		System.out.println("3 + 4 = " + result);
	}
}
