package com.yulim.day_0321.Application5.Problem;

public class Problem5_2 {
	public static void main(String[] args) {
		Func1 func = n -> n % 2 == 1;

		Func2 func2 = (male, name) -> {
			if (male == true) {
				return "Mr." + name;
			}
			return "Ms." + name;
		};

		boolean result = func.call(4);
		String result2 = func2.call(true, "Wilson");
		System.out.println(result + result2);
	}
}