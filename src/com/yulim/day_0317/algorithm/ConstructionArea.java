package com.yulim.day_0317.algorithm;

public class ConstructionArea extends Location {
	private int noise;

	ConstructionArea(int x, int y, int noise) {
		super(x, y);
		this.noise = noise;
	}

	public int getNoise() {
		return noise;
	}
}
