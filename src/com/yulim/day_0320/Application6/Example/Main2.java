package com.yulim.day_0320.Application6.Example;

import java.io.FileReader;
import java.io.IOException;

// FileReader
public class Main2 {

    public static String main(String[] args) throws IOException {
        String result = "";
        FileReader fr = new FileReader("data.txt");

        int ch = fr.read();
        while (ch != -1) {
            result += (char) ch;
            ch = fr.read();
        }
        fr.close();
        return result;
    }

}
