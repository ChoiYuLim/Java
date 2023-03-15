package com.yulim.day_0315.Problem12;

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer("울트라 갤럭시", 2300000, "블랙", "삼성");
		Book book = new Book("데미안", 13000, "흰색", "bn");
		computer.setWeight(1.5);
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		System.out.println(computer.getColor());
		System.out.println(computer.getMakerName());
		System.out.println(computer.getWeight());
	}
}
