package com.yulim.day_0320.Application7.Example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class Main3 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("data.properties");
        Properties prop = new Properties();
        prop.setProperty("heroName", "한석봉");
        prop.setProperty("heroHp", "50");
        prop.setProperty("heroMp", "30");
        prop.store(fw, "용사의 정보");
        fw.close();
    }
}
