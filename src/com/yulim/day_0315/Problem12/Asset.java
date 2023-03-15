package com.yulim.day_0315.Problem12;

// 자산은 무형 자산, 유형 자산이 존재
// 자산이라는 개념으로 인스턴스를 만들 수 없게 하기 위해 abstract 사용
// 무형 자산과 유형 자산 모두 공통적으로 이름이라는 속성은 갖고 있음

public abstract class Asset {

	public Asset(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

}
