package com.yulim.day_0322.Application11.Example;

public class Counter {
    int num = 0;

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();

        for (int i = 0; i < 1000; i++) { // 1000개한테 실행해! 하고 for문은 끝났지만, 안에 있는 thread들은 아직 일을 하는 중
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                    counter.num++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(5000);
        System.out.println(counter.num);
    }
}
