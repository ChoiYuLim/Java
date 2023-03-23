package com.yulim.day_0323.finalProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static String getToday() {
        // 오늘 날짜 정보를 가져옴
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    // 2013/10/20 형태로 출력하게
    public static String formattedToString(String day) {

        String str = day.substring(0, 4) + "/" + day.substring(4, 6) + "/" + day.substring(6, 8);
        return str;
    }
}
