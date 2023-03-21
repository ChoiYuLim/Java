package com.yulim.day_0320.Application7;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Problem7_1 {
	public static void main(String[] args) throws IOException {
		Reader fr = new FileReader("gradle.properties");
		Properties prop = new Properties();
		prop.load(fr);
		String useAndroidX = prop.getProperty("android.useAndroidX");
		System.out.println(useAndroidX);
		fr.close();

	}
}
