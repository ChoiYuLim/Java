package com.yulim.day_0321.Application5.Problem;

interface Func1 {
	public abstract boolean call(int n);
}

interface Func2 {
	public abstract String call(boolean m, String n);
}

public class Utils {

	public static boolean isOdd(int n) {
		return n % 2 == 1;
	}

	public static String addNamePrefix(boolean male, String name) {
		if (male == true) {
			return "Mr." + name;
		}
		return "Ms." + name;
	}

	public static void main(String[] args) {
		Func1 isOdd = Utils::isOdd;
		Func2 addNamePrefix = Utils::addNamePrefix;
		boolean result = isOdd.call(4);
		String result2 = addNamePrefix.call(true, "Wilson");
		System.out.println(result + result2);
	}
}
