package com.yulim.day_0323.finalProject.entity;

public class Book {
    private static int count = 0;
    private int id;
    private String name;
    private String author;
    private String publishedDate;
    private boolean canBorrow = true;
    private int currentOwnerId = -1;

    public Book(String name, String author, String publishedDate, boolean canBorrow,
            int currentOwnerId) {
        this.id = count;
        count++;
        this.name = name;
        this.author = author;
        this.publishedDate = publishedDate;
        this.canBorrow = canBorrow;
        this.currentOwnerId = currentOwnerId;
    }
    
    public Book(String name, String publishedDate, String author) {
        this(name, author, publishedDate, true, -1);
    }
    

    @Override
    public String toString() {
        String currentId = "" + currentOwnerId;
        if (this.currentOwnerId == -1) {
            currentId = "없음";
        }
        return "책 번호 : " + id + ", 책 이름 : " + name + ", 저자 : " + author + ", 출판년도 : "
                + publishedDate + ", 대출가능여부 : " + canBorrow + ", 현재 대출 회원 id : " + currentId;
    }

    public int getCurrentOwnerId() {
        return currentOwnerId;
    }

    public void setCurrentOwnerId(int currentOwnerId) {
        this.currentOwnerId = currentOwnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getCanBorrow() {
        return canBorrow;
    }

    public void setCanBorrow(boolean canBorrow) {
        this.canBorrow = canBorrow;
    }

}
