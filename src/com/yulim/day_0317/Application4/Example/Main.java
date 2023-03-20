package com.yulim.day_0317.Application4.Example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List list = new ArrayList<>();

        list.add(1);
        list.add("홍길동");
        list.add(null);
        list.add(3.0);
        list.add(true);

        Object obj = (int) list.get(0);
        System.out.println((int) list.get(0) + 10);
        // 개발자가 자신을 믿고 캐스팅 직접 하는거 에러 나기 쉬움
        
    }
}
