package com.yulim.day_0309;

public class Problem5_1 {

    public static void main(String[] args) {
        System.out.println("자기소개를 하겠습니다.");
        introduceOneself();
    }

    public static void introduceOneself() {
        String name = "최유림";
        int age = 26;
        double height = 157.0;
        String gender = "여자";
        System.out.printf("제 이름은 %s이고 %d살이며 %.1fcm이고 %s입니다.", name, age, height, gender);
    }

}
