package com.yulim.day_0320.Exception15.Example;

import java.io.FileWriter;
import java.io.IOException;

public class 자동close {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write("hi");
        } catch (IOException e) {
            System.out.println("뭔가 에러 발생");
        }
    }
}
