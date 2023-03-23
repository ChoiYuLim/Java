package com.yulim.day_0323.finalProject;


public class History { // 한명의 회원이 빌린 책들 기록
    private Book book;
    private String borrowDate = Util.getToday();
    private Boolean isExtended = false;

    public History(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "History [book=" + book + ", borrowDate=" + borrowDate + ", isExtended=" + isExtended
                + "]";
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public Boolean getIsExtended() {
        return isExtended;
    }

    public void setIsExtended(Boolean isExtended) {
        this.isExtended = isExtended;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

}
