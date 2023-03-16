package com.yulim.day_0316.Problem14;

public class Main_Account {
	public static void main(String[] args) {
		Account a = new Account("4649", 1592);
		System.out.println(a);
		Account b = new Account(" 4649", 1592);
		System.out.println(b);

		if (a.equals(b)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
