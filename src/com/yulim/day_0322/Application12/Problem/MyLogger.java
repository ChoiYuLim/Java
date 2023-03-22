package com.yulim.day_0322.Application12.Problem;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
	private static MyLogger instance;
	private static FileWriter fw;

	private MyLogger() {
	}

	public static MyLogger getInstance() {
		synchronized (MyLogger.class) {
			if (instance == null) {
				instance = new MyLogger();
			}
		}
		try {
			fw = new FileWriter("dummylog.txt", true);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return instance;
	}

	public void log(String text) {
		try {
			fw.write(text + "\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
