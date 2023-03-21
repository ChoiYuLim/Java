package com.yulim.day_0321.Application10.Problem.Problem10_5;

public class UpCounter implements Counter {

    int count;

    public UpCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int count() {
        this.count++;
        return this.count;
    }

}
