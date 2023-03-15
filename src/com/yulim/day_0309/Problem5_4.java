package com.yulim.day_0309;

public class Problem5_4 {

    public static final double PI = 3.141592;

    public static void main(String[] args) {
        System.out.println(calcTriangleArea(4, 5)+"cm²");
        System.out.printf("%.2fcm²",calcCircleArea(3));
    }

    public static double calcTriangleArea(double bottom, double height) {
        double area = bottom * height / 2;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double circleArea = Math.pow(radius, 2) * PI;
        return circleArea;
    }

}
