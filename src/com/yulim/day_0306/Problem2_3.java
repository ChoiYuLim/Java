package com.yulim.day_0306;

public class Problem2_3 {
    public static void main(String[] args) {
        System.out.println("점을 보세요");
        System.out.println("이름을 입력해 주세요");

        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("나이를 입력 해 주세요");

        String ageString = new java.util.Scanner(System.in).nextLine();

        int age = Integer.valueOf(ageString);
        int fortune = new java.util.Random().nextInt(4);

        fortune++;

        System.out.println("점꾀가 나왔습니다!");
        System.out.println(age + "살의 " + name + "씨, 당신의 운세번호는 " + fortune + " 입니다");
        System.out.println("1:대박 2:중박 3:보통 4:망");
    }
}
