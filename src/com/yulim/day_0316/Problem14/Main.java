package com.yulim.day_0316.Problem14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {

		// 현재의 날짜를 Date 형으로 얻는다
		Date now = new Date();

		// 얻은 날짜정보를 Calendar에 설정한다
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);

		// Calendar에서 일(day) 값을 얻는다.
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		// 얻은 값에 100을 더한 값을 Calendar의 일에 설정한다
		calendar.set(Calendar.DAY_OF_MONTH, day + 100);

		// Calendar의 날짜정보를 Date 형으로 변환한다
		Date date = calendar.getTime();

		// SimpleDateFormat 을 이용하여 Date 인스턴스의 내용을 표시한다
		SimpleDateFormat format = new SimpleDateFormat("서기 yyyy년 MM월 dd일");
		String s = format.format(date);
		System.out.println(s);
	}
}
