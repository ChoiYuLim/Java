package com.yulim.day_0317.algorithm;

public class DistanceCalculator {
	private double distance;

	DistanceCalculator(int treeX, int treeY, int constructionX, int constructionY) {
		this.distance = Math.sqrt(
				(treeX - constructionX) * (treeX - constructionX) + (treeY - constructionY) * (treeY - constructionY));
	}

	public double getDistance() {
		return distance;
	}

}
