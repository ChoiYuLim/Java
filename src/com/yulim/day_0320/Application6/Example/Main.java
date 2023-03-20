package com.yulim.day_0320.Application6.Example;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt", true); // 덮어쓴다
        fw.write("Hello\n");
        fw.flush();// 이걸 꼭 해줘야지 써진다.
        fw.close();
    }
}
