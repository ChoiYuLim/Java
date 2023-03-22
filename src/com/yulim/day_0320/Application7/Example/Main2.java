package com.yulim.day_0320.Application7.Example;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("data.properties");
        Properties prop = new Properties();
        prop.load(fr);
        String name = prop.getProperty("heroName");
        String hp = prop.getProperty("heroHp");
        System.out.println("용사의 이름 : " + name);
        System.out.println("용사의 Hp : " + hp);
        fr.close();
    }
}
