package com.yulim.day_0323.finalProject;

import java.util.Calendar;
import java.util.Date;

public class History { // 한명의 회원이 빌린 책들 기록
	private Book book;
	private String borrowDate = Util.getToday();
	private Date deadLine = Util.addDate(new Date(), 14);
	private Boolean isExtended = false;

	public History(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "대출 이력 [책 이름=" + book.getName() + ", 빌린 날짜=" + borrowDate + ", 반납 날짜="
				+ Util.formattedDateToString(deadLine) + ", 연장 여부=" + isExtended + "]";
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public Date getDelayedDeadLine() {
		// 얻은 날짜정보를 Calendar에 설정한다
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(deadLine);

		// Calendar에서 일(day) 값을 얻는다.
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		// 얻은 값에 100을 더한 값을 Calendar의 일에 설정한다
		calendar.set(Calendar.DAY_OF_MONTH, day + 7);

		// Calendar의 날짜정보를 Date 형으로 변환한다
		return calendar.getTime();
	}

	public void setDeadLine(Date deadLine) {

		this.deadLine = deadLine;
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
