package com.yulim.day_0320.Application6.Problem;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Problem6_1 {
    public static void main(String[] args) throws Exception {
            FileInputStream fileInput = new FileInputStream(args[0]);
            FileOutputStream fileOutput = new FileOutputStream(args[1]);
       
            // word의 값을 byte로 변환하여 저장
            byte b[] = fileInput.readAllBytes();

            // 파일에 word 작성하기
            fileOutput.write(b);

            // 파일 닫기
            fileInput.close();
            fileOutput.close();
    }

}
