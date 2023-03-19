package com.yulim.day_0317.algorithm;

public enum ResultString {
	SILENT("silent"), NOISY("noisy");

	private final String result;

	ResultString(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}
}
