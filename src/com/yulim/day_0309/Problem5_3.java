package com.yulim.day_0309;

public class Problem5_3 {

    public static void main(String[] args) {
        email("안녕하세요!", "yulim_choi@naver.com", "어쩌구 저쩌구");
        System.out.println();
        email("yulim_choi@naver.com", "어쩌구 저쩌구");
    }

    public static void email(String title, String address, String text) {
        System.out.printf("%s 에 아래의 메일을 송신한다.\n제목 : %s\n본문 : %s", address, title, text);
    }

    public static void email(String address, String text) {
        email("제목 없음", address, text);
    }
}
