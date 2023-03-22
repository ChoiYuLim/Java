package com.yulim.day_0320.Application7.Example;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String str = "홍길동,한석봉,신사임당";

        // 콤마를 기준으로 자를 준비
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}