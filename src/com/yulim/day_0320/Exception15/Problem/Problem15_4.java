package com.yulim.day_0320.Exception15.Problem;

import java.io.IOException;

public class Problem15_4 {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");
        try {
            throw new IOException();
        }catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}

