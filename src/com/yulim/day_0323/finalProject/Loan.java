package com.yulim.day_0323.finalProject;

import java.util.Date;

/**
 * 대출 클래스: 회원 id, 책 id, 대출 날짜, 반납 날짜, 연장 여부
 */

public class Loan {
    private int bookId;
    private int memberId;
    private Date borrowDate;
    private Date deadLine;
    private Boolean isExtended = false;

    public Loan(int bookId, int memberId) {
        super();
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = new Date();
        this.deadLine = Util.addDate(this.borrowDate, 14);
    }

    @Override
    public String toString() {
        return "대출 이력 [bookId=" + bookId + ", memberId=" + memberId + ", borrowDate=" + borrowDate
                + ", deadLine=" + deadLine + ", isExtended=" + isExtended + "]";
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Boolean getIsExtended() {
        return isExtended;
    }

    public void setIsExtended(Boolean isExtended) {
        this.isExtended = isExtended;
    }

}
