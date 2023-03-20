package com.yulim.day_0320.Application6.Example;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main3 {
    // public static void main(String[] args) throws IOException {
    // FileOutputStream fos = new FileOutputStream("save.txt", true);
    // fos.write(65);
    // fos.write(66);
    // fos.flush();
    // fos.close();
    // }

    public static void stringReader(String[] args) throws IOException {
        String msg = "Hello World";
        Reader reader = new StringReader(msg);
        char ch1 = (char) reader.read();
        char ch2 = (char) reader.read();
    }
}
