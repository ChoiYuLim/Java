package com.yulim.day_0321.Application5.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		/* 아래 3가지 형식이 모두 같은 것 */
		nums.stream().forEach((num) -> {
			System.out.println(num);
		});
		nums.stream().forEach(num -> System.out.println(num));
		nums.stream().forEach(System.out::println);

		/* 아래 두가지 형식이 모두 같은 것 */

		// 1. for문으로 짝수+1만 출력하기
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {
				System.out.println(nums.get(i) + 1);
			}
		}

		// 2. stream filter로 짝수만 거른 뒤 짝수 +1만 출력하기
		nums.stream().filter((num) -> num % 2 == 0).forEach((num) -> System.out.println(num + 1));
		// 함수형 프로그래밍 기법으로
		// stream으로 줄 지어서 생각, 가다가 필터로~ 거르고 ...
		// filter는 거르기, map은 변환, forEach는 뺑뺑이 돌리는 것

		// map으로 타입 변환하기 (Integer에서 String으로 변환)
		nums.stream().map((num) -> num + "번").forEach((num) -> System.out.println(num + 1));
		// List<Integer>에서 List<String>으로 변경됨
		// filter와 map은 리턴 타입이 스트림이야
		// 메소드 체이닝: . 찍고 반복하는 것
		// forEach는 void여서 제일 마지막 밖에 못 온다!

		List<String> names = new ArrayList<>();
		names.add("박경덕");
		names.add("이경덕");
		names.add("박태현");
		names.add("박준하");
		names.add("이동학");

		List<String> parks = getParkList2(names);
		System.out.println(parks);

	}

	/* 아래 getParkList와 getParkList2는 모두 같은 역할 */

	// 1. for문으로 "박"으로 시작하는 이름 결과로 리턴
	public static List<String> getParkList(List<String> names) {
		List<String> results = new ArrayList<>();

		for (String name : names) {
			if (name.startsWith("박")) {
				results.add(name);
			}
		}
		return results;
	}

	// 2. "박"으로 시작하는 이름 filter로 걸러서 List로 반환하기
	public static List<String> getParkList2(List<String> names) {
		return names.stream().filter(name -> name.startsWith("박")).collect(Collectors.toList());
	}
	// stream을 list로 변경하는 방법: .collect(Collectors.toList())
}
