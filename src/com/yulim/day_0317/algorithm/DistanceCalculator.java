package com.yulim.day_0317.algorithm;

public class DistanceCalculator {

	public static double getDistance(int treeX, int treeY, int constructionX, int constructionY) {
		return Math.sqrt(
				(treeX - constructionX) * (treeX - constructionX) + (treeY - constructionY) * (treeY - constructionY));
	}
}
