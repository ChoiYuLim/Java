package com.yulim.day_0321.Application10.Problem.Test10_1;

import static org.junit.Assert.*;
import org.junit.Test;
import com.yulim.day_0321.Application10.Problem.Problem10_1.Bank;

public class BankTest {

    @Test(expected = IllegalArgumentException.class)
    public void setNameErrorTest() {
        Bank bank = new Bank();
        bank.setName("하나");
    }

    @Test
    public void setNameCorrectTest() {
        Bank bank = new Bank();
        bank.setName("하나은행");
        assertEquals("하나은행", bank.getName());
    }

    @Test
    public void setNameErrorTest2() {
        try {
            Bank bank = new Bank();
            bank.setName("하나");
        } catch (IllegalArgumentException e) {
            assertEquals("이름이 잘못 되었음", e.getMessage());
        }
    }


}
