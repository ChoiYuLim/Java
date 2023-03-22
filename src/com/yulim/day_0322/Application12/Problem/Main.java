package com.yulim.day_0322.Application12.Problem;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		MyLogger logger1 = MyLogger.getInstance();
		logger1.log("first");
		MyLogger logger2 = MyLogger.getInstance();
		logger2.log("second");

	}
}
