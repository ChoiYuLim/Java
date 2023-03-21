package com.yulim.day_0321.Application10.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.yulim.day_0321.Application10.Example.Account;

public class AccountTest {

    @Test
    public void 생성자_테스트() {
        Account account = new Account("홍길동", 30000);
        assertEquals("홍길동", account.getOwner());
        assertEquals(30000, account.getBalance());

    }

    @Test
    public void transfer_테스트() {
        Account account = new Account("홍길동", 30000);
        Account account2 = new Account("둘리", 0);

        account.transfer(account2, 10000);
        assertEquals(10000, account2.getBalance());
        assertEquals(20000, account.getBalance());

        Account account3 = new Account("가짜", 0);

        account3.transfer(account, 10000);
        assertEquals(0, account3.getBalance());


    }

    @Test(expected = NullPointerException.class)
    public void throwExceptionWithTwoCharName() {
        String str = null;
        str.length(); 
    }

}

