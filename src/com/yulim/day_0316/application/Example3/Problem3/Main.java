package com.yulim.day_0316.application.Example3.Problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("b1", new Date(), "~~");
		Book b2 = new Book("b2", new Date(), "~~");

		System.out.println(b1.equals(b2));

		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		Collections.sort(list);

		for (Book b : list) {
			System.out.println(b.getTitle());
		}

	}
}
