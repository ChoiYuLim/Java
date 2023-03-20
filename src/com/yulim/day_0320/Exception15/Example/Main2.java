// package com.yulim.day_0320.Example;
//
// public class Main2 {
// public static void main(String[] args) {
// try {
// something();
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
//
// public static void something() throws InterruptedException { // 에러 발생해도 무시하겠다.
// Thread.sleep(1000);
// }
// }
//package com.yulim.day_0320.Exception15.Example;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Main2 {
//    public static void main(String[] args) {
//        try {
//            something();
//
//            FileWriter fw = new FileWriter("data.txt");
//
//        } catch (InterruptedException | IOException e) {
//            if (e instanceof IOException)
//                e.printStackTrace();
//            else {
//
//            }
//        }
//    }
//
//    public static void something() throws InterruptedException { // 에러 발생해도 무시하겠다.
//        Thread.sleep(1000);
//    }
//}
package com.yulim.day_0320.Exception15.Example;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            something();

            FileWriter fw = new FileWriter("data.txt");

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {

        } // 보통 이렇게 쓴다
    }

    public static void something() throws InterruptedException { // 에러 발생해도 무시하겠다.
        Thread.sleep(1000);
    }
}
