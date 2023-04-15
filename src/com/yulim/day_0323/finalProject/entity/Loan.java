package com.yulim.day_0323.finalProject.entity;

import java.util.Date;
import com.yulim.day_0323.finalProject.DateUtil;

/**
 * 대출 클래스: 회원 id, 책 id, 대출 날짜, 반납 날짜, 연장 여부
 */

public class Loan {
    private int bookId;
    private String bookName;
    private int memberId;
    private Date borrowDate;
    private Date deadLine;
    private Boolean isExtended;
    private Boolean isReturned;

    public Loan(int bookId, String bookName, int memberId) {
        this(bookId, bookName, memberId, new Date(), DateUtil.addDate(new Date(), 14), false, true);
    }


    // csv에서 읽어온 대로 넣기
    public Loan(int bookId, String bookName, int memberId, Date borrowDate, Date deadLine,
            Boolean isExtended, Boolean isReturned) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.deadLine = deadLine;
        this.isExtended = isExtended;
        this.isReturned = isReturned;
    }


    @Override
    public String toString() {
        return "책 id : " + bookId + ", 책 이름 : " + bookName + ", 대출 일자 : "
                + DateUtil.formattedDateToString(borrowDate) + ", 반납 일자 : "
                + DateUtil.formattedDateToString(deadLine) + ", 반납 여부 : " + isReturned + ", 연장 여부 : "
                + isExtended;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public Boolean getIsReturned() {
        return isReturned;
    }

    public void setIsReturned(Boolean isReturned) {
        this.isReturned = isReturned;
    }



}
