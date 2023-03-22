package com.yulim.day_0322.Application12.Example;

interface Counter {
    int count();
}


class UpCounter implements Counter {
    int count = 0;

    @Override
    public int count() {
        count++;
        return count;
    }

}


class DownCounter implements Counter {
    int count = 0;

    @Override
    public int count() {
        count--;
        return count;
    }
    
}


public class Dependency {
    final DownCounter counter;
    // final Counter counter;

    public Dependency(DownCounter counter) {
        super();
        this.counter = counter;
    }

    public static void main(String[] args) {
        Dependency main = new Dependency(new DownCounter());
    }

    public void count(DownCounter counter) {
        counter.count();
    }

}
