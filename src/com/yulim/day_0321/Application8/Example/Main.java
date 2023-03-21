package com.yulim.day_0321.Application8.Example;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.com");
			// InputStream: 바이트 단위로 데이터를 읽어들이는 스트림 클래스
			// URL.openStream(): 주어진 URL에서 데이터를 읽어들이기 위한 메서드
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			int i = isr.read();
			while (i != -1) {
				System.out.println((char) i);
				i = isr.read();
			}
			isr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
