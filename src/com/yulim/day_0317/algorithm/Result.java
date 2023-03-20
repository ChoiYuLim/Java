package com.yulim.day_0317.algorithm;

public class Result {

	public static ResultString getResult(double distance, ConstructionArea constructionArea) {
		if (distance >= constructionArea.getNoise()) {
			return ResultString.SILENT;
		} else {
			return ResultString.NOISY;
		}
	}

}
