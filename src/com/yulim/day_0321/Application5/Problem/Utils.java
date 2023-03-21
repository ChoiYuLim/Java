package com.yulim.day_0321.Application5.Problem;

public class Utils {

    interface Func1 {
        public abstract int call(int a, int b);
    }

    interface Func2 {
        public abstract int call(int a, int b);
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static String addNamePrefix(boolean male, String name) {
        if (male == true) {
            return "Mr." + name;
        }
        return "Ms." + name;
    }
}
