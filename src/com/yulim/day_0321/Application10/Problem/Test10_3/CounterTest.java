package com.yulim.day_0321.Application10.Problem.Test10_3;

import static org.junit.Assert.*;
import org.junit.Test;
import com.yulim.day_0321.Application10.Problem.Problem10_2.Counter;

public class CounterTest {

    @Test
    public void test() {
        Counter counter = new Counter();
        counter.setCount(3);
        counter.increment();
        assertEquals(4, counter.getCount());
    }
    
    @Test
    public void test2() {
        Counter counter = new Counter();
        counter.increment();
        assertEquals(1, counter.getCount());
    }

}
