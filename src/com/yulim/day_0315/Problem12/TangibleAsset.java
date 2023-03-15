package com.yulim.day_0315.Problem12;

// 유형 자산은 자산을 상속받고, Thing 인터페이스를 implements함
// 유형 자산은 자산에서 확장해서 가격과 색깔이라는 속성을 가짐
// 형태가 있으므로 Thing을 implements
// Asset 안에 있는 메소드 중 추상 메소드가 없으므로, 오버라이딩 해줄 게 없음

public abstract class TangibleAsset extends Asset implements Thing {

	public TangibleAsset(String name, int price, String color) {
		super(name);
		this.price = price;
		this.color = color;
	}

	private int price;
	private String color;
	private double weight;

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	// Thing 인터페이스 오버라이딩

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
