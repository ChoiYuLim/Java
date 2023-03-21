package com.yulim.day_0321.Application10.Problem.Test10_5;

import static org.junit.Assert.*;
import org.junit.Test;
import com.yulim.day_0321.Application10.Problem.Problem10_5.DownCounter;
import com.yulim.day_0321.Application10.Problem.Problem10_5.UpCounter;

public class CounterTest {

    @Test
    public void test() {
        UpCounter uc = new UpCounter(3);
        uc.count();
        assertEquals(4, uc.getCount());
    }

    @Test
    public void test2() {
        UpCounter uc = new UpCounter(3);
        uc.count();
        uc.count();
        uc.count();

        assertEquals(6, uc.getCount());
    }

    @Test
    public void test3() {
        DownCounter dc = new DownCounter(3);
        dc.count();
        assertEquals(2, dc.getCount());
    }

    @Test
    public void test4() {
        DownCounter dc = new DownCounter(3);
        dc.count();
        dc.count();
        dc.count();
        assertEquals(0, dc.getCount());
    }
}
