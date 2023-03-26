package com.yulim.day_0323.finalProject;

public class Book {
    private static int count = 0;
    private int id;
    private String name;
    private String author;
    private String publishedDate;
    private boolean canBorrow = true;
    private int currentOwnerId = -1;

    public Book(String name, String publishedDate, String author) {
        this.name = name;
        this.publishedDate = publishedDate;
        this.author = author;
        this.id = count;
        count++;
    }

    @Override
    public String toString() {
        return "책 번호=" + id + ", 책 이름=" + name + ", 저자=" + author + ", 출판년도=" + publishedDate
                + ", 대출가능여부=" + canBorrow;
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
