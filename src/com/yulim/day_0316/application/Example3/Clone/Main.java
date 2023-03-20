package com.yulim.day_0316.application.Example3.Clone;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("홍길동");
		Hero h2 = h1.clone(); // 깊은 복사
		Hero h3 = h1; // 얕은 복사

		System.out.println(h1);
		System.out.println(h2); // 깊은 복사이므로 h1과 해시 값이 다름
		System.out.println(h3); // 얕은 복사이므로 h1과 해시 값이 똑같음

		System.out.println(h1.sword);
		System.out.println(h2.sword); // 깊은 복사이므로 h1과 해시 값이 다름
		System.out.println(h3.sword); 
	}
}
