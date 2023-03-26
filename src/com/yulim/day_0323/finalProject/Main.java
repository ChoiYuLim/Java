package com.yulim.day_0323.finalProject;

public class Main {

	public static void main(String[] args) {
		// 처음 시작
		SystemManager manager = new SystemManager();
		System.out.println("도서 대출 관리 프로그램");
		try {
			manager.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
