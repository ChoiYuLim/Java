package com.yulim.day_0316.application.Example3.Problem3;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {

	public Book(String title, Date publishDate, String comment) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}

	private String title;
	private Date publishDate;
	private String comment;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate); // 날짜 순으로 정렬
	}

	@Override
	public Book clone() {
		return new Book(title, publishDate, comment);
	}
}
