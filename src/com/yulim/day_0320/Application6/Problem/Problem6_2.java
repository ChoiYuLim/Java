package com.yulim.day_0320.Application6.Problem;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Problem6_2 {
	public static void main(String args[]) {
		try (FileInputStream fis = new FileInputStream("data.txt");
				FileOutputStream fos = new FileOutputStream("copydata.txt");
				BufferedInputStream bins = new BufferedInputStream(fis);
				BufferedOutputStream bons = new BufferedOutputStream(fos)) {

			byte[] buffer = new byte[1024];

			int bytesRead = bins.read(buffer);
			while (bytesRead != -1) {
				bons.write(buffer, 0, bytesRead);
				bytesRead = bins.read(buffer);
			}

			GZIPOutputStream gzipos = new GZIPOutputStream(new FileOutputStream("copydata.zip"));
			FileInputStream fis2 = new FileInputStream("copydata.txt");

			BufferedInputStream bins2 = new BufferedInputStream(fis2);

			int len;
			while ((len = bins2.read(buffer)) > 0) {
				gzipos.write(buffer, 0, len);
			}

			gzipos.finish();
			System.out.println("압축 완료");

			GZIPInputStream gzipis = new GZIPInputStream(new FileInputStream("copydata.zip"));
			FileOutputStream fos2 = new FileOutputStream("copydata_zip.txt");

			BufferedOutputStream bons2 = new BufferedOutputStream(fos2);

			while ((len = gzipis.read(buffer)) > 0) {
				bons2.write(buffer, 0, len);
			}
			System.out.println("압축 해제 완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}