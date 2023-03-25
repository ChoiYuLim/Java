package com.yulim.day_0323.finalProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Member {

	private String name;
	private int id;
	private static int count = 0;
	private String joinDate;
	private String address;
	private String birth;
	private String gender;
	private String phone;
	private ArrayList<History> history; // 이 사람이 빌렸던 모든 책들만 있으면 지금 빌리고 있는 책도 확인 가능

	// 회원 가입
	public Member(String name, String address, String birth, String gender, String phone) {
		this.name = name;
		this.address = address;
		this.birth = birth;
		this.gender = gender;
		this.phone = phone;
		this.joinDate = Util.getToday();
		this.history = new ArrayList<History>();
		this.id = count;
		count++;
	}

	public void addHistory(Book book) {
		history.add(new History(book));
	}

	@Override
	public String toString() {
		return "회원번호=" + id + ", 이름=" + name + ", 성별=" + gender + ", 생년월일=" + birth + ", 전화번호=" + phone + ", 주소="
				+ address + ", 가입날짜=" + joinDate + ", 대출 이력=" + history;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Member.count = count;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<History> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<History> history) {
		this.history = history;
	}

}
