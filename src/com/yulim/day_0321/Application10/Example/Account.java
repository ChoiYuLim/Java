package com.yulim.day_0321.Application10.Example;

public class Account {

    public static void main(String[] args) {
        System.out.println("---테스트 시작---");
        Account account = new Account("홍길동", 30000);
        Account account2 = new Account("둘리", 10000);

        account.transfer(account2, Integer.MAX_VALUE + 1);

        if (account2.getBalance() != 2147483648L) {

        }

        System.out.println("---홍길동이 둘리에게 10000 송금---");

        System.out.println(account);
        System.out.println(account2);

        System.out.println("---테스트 종료---");

    }

    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // 1원 ~ 1억까지
    // 1원, 2원, 99999999원, 1억원 : 성공
    // 0, 1억1원 : 실패
    public void transfer(Account dest, int amount) {
        dest.setBalance(dest.getBalance() + amount);
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account [owner=" + owner + ", balance=" + balance + "]";
    }


}
