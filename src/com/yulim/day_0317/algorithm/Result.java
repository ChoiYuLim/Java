package com.yulim.day_0317.algorithm;

public class Result {

	public static ResultString getResult(DistanceCalculator calc, ConstructionArea constructionArea) {
		if (calc.getDistance() >= constructionArea.getNoise()) {
			return ResultString.SILENT;
		} else {
			return ResultString.NOISY;
		}
	}

}
