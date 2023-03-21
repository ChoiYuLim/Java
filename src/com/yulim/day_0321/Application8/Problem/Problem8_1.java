package com.yulim.day_0321.Application8.Problem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Problem8_1 {
	public static void main(String[] args) throws IOException {

		// 저장할 파일 경로와 이름
		String saveFilePath = "C:\\Users\\ChoiYuLim\\OneDrive\\바탕 화면\\icon.ico";

		// 아이콘 파일의 URL 객체 생성
		URL url = new URL("https://alimipro.com/favicon.ico");

		// URL 클래스의 openStream() 메소드를 사용하여 이미지 파일을 읽어오는 InputStream 객체를 생성
		// 저장할 파일 경로에 대한 FileOutputStream 객체를 생성
		try (InputStream inputStream = url.openStream();
				FileOutputStream outputStream = new FileOutputStream(saveFilePath)) {

			// inputStream으로부터 1024바이트씩 읽어들여 buffer에 저장하고
			// outputStream에 buffer에 저장된 바이트 데이터를 씀
			// 이를 inputStream으로부터 더 이상 읽어들일 데이터가 없을 때까지 반복
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
