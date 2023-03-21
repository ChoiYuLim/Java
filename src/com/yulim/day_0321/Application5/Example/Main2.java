package com.yulim.day_0321.Application5.Example;

public class Main2 {

	public static void main(String[] args) {
		MyFunction func = (int x, int y) -> {
			return x + y;
		};

		int result = func.call(3, 4);
		System.out.println("3 + 4 = " + result);
	}
}
