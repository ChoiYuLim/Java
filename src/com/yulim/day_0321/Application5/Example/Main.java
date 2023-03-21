package com.yulim.day_0321.Application5.Example;

import java.util.function.IntBinaryOperator;

public class Main {
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        IntBinaryOperator func = Main::add;
        
        int result = func.applyAsInt(5,3);
        System.out.println("5 + 3 = " + result);
    }
//    interface MyFunction {
//        int call(int a, int b);
//    }
//
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        IntBinaryOperator addFunction = Main::add;
//        MyFunction deohagiFunction = Main::add;
//
//        // lamda expression
//        MyFunction addFunction2 = (int a, int b) -> {
//            return a + b;
//        }; // 익명 함수라고 볼 수 있음
//           // 그때 그때 필요한거 바로 남둚
//
//        MyFunction gophagi = (a, b) -> {
//            return a * b;
//        };
//
//        MyFunction nanugi = (a, b) -> a / b;
//
//        int result = addFunction.applyAsInt(2, 3);
//
//        result = deohagiFunction.call(3, 4);
//    }
}
