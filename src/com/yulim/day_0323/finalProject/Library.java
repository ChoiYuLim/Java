package com.yulim.day_0323.finalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	private ArrayList<Member> memberList;
	private ArrayList<Book> bookList = new ArrayList<>(); // 도서관의 모든 책들을 가지고 있어
	private ArrayList<History> borrowHistory; //

	public void temp() {
		bookList.add(new Book("a", "20100930", "유림"));
		bookList.add(new Book("b", "20120905", "유림2"));
		bookList.add(new Book("v", "20151230", "유림3"));
	}

	public void readMemeber() {
		if (memberList == null || memberList.size() == 0) {
			System.out.println("현재 회원이 아무도 없습니다.");
		} else {
			memberList.stream().forEach(i -> System.out.println(i.getName()));
		}
	}

	public void updateMember(Scanner sc) {
		if (memberList == null || memberList.size() == 0) {
			System.out.println("현재 회원이 아무도 없습니다.");
		} else {
			System.out.println("\n<회원 수정>\n수정하고 싶은 회원 번호를 입력하세요.");
			int id = sc.nextInt();
			try {
				memberList.get(id);
				System.out.println("이름을 수정해주세요.");
				memberList.get(id).setName(sc.next());
				System.out.println("성별을 수정해주세요. (여자/남자)");
				memberList.get(id).setGender(sc.next());
				System.out.println("생일을 수정해주세요. (19980102의 형식)");
				memberList.get(id).setBirth(sc.next());
				System.out.println("주소를 수정해주세요.");
				memberList.get(id).setAddress(sc.next());
				System.out.println("연락처를 수정해주세요.");
				memberList.get(id).setPhone(sc.next());
			} catch (Exception e) {
				System.out.println("<회원 수정 실패>");
				return;
			}

		}

	}

	public void deleteMember(Scanner sc) {
		if (memberList == null || memberList.size() == 0) {
			System.out.println("현재 회원이 아무도 없습니다.");
		} else {
			System.out.println("\n<회원 삭제>\n삭제하고 싶은 회원 번호를 입력하세요.");

			int id = sc.nextInt();
			try {
				memberList.indexOf(id);
				memberList.remove(id);
				System.out.println("<삭제 완료>");
			} catch (Exception e) {
				System.out.println("<삭제 실패>");
			}
		}
	}

	public void recoverMember() {

	}

	public void addBook(Scanner sc) {

		try {
			System.out.println("\n<도서 추가>\n추가할 책 이름을 입력하세요.");
			String id = sc.next();
			System.out.println("책 저자를 입력해주세요.");
			String author = sc.next();
			System.out.println("책 출판일을 입력해주세요.");
			String publishedDate = sc.next();
			bookList.add(new Book(id, publishedDate, author));
		} catch (Exception e) {
			System.out.println("<책 수정 실패>");
			return;
		}
	}

	public void readBook() {
		// 모든 책들을 읽어와야해
		if (bookList == null || bookList.size() == 0) {
			System.out.println("현재 책이 아무것도 없습니다.");
		} else {
			bookList.stream().filter(i -> i.getCanBorrow() == true).forEach(book -> System.out.println(book.getName()));
		}
	}

	public void updateBook(Scanner sc) {
		if (bookList == null || bookList.size() == 0) {
			System.out.println("현재 책이 아무것도 없습니다.");
		} else {
			System.out.println("\n<책 수정>\n수정하고 싶은 책 번호를 입력하세요.");
			int id = sc.nextInt();
			try {
				bookList.get(id);
				System.out.println("책 이름을 수정해주세요.");
				bookList.get(id).setName(sc.next());
				System.out.println("책 저자를 수정해주세요.");
				bookList.get(id).setAuthor(sc.next());
				System.out.println("출판일을 수정해주세요.");
				bookList.get(id).setPublishedDate(sc.next());
			} catch (Exception e) {
				System.out.println("<책 수정 실패>");
				return;
			}

		}

	}

	public void deleteBook(Scanner sc) {
		if (bookList == null || bookList.size() == 0) {
			System.out.println("현재 책이 아무것도 없습니다.");
		} else {
			System.out.println("\n<책 삭제>\n삭제하고 싶은 책 번호를 입력하세요.");

			int id = sc.nextInt();
			try {
				bookList.indexOf(id);
				bookList.remove(id);
				System.out.println("<삭제 완료>");
			} catch (Exception e) {
				System.out.println("<삭제 실패>");
			}
		}
	}

	// 책 대출
	public void borrowBook(Scanner sc, int memberId) {
		System.out.println("\n<도서 대출>\n빌리고 싶은 책 번호를 입력해주세요");

		int bookId = sc.nextInt();
		Member member = memberList.get(memberId);
		Book book = bookList.get(bookId);

		try {
			if (book.getCanBorrow() == true) {
				// history에 저장해야함

				member.addHistory(book);

				// book에서 canBorrow를 변경해야함
				book.setCanBorrow(false);

				book.setCurrentOwnerId(memberId);

				System.out.println("\n<대출 완료>\n" + member.getName() + "님이 " + book.getName() + "을 대출했습니다.");
			} else {
				System.out.println("<대출 실패, 대출 중인 도서입니다.>");
				return;
			}

		} catch (Exception e) {
			System.out.println("<대출 실패>");
			return;
		}
	}

	// 책 반납
	public void returnBook(Scanner sc, int memberId) {
		System.out.println("\n<도서 반납>\n반납하고 싶은 책 번호를 입력해주세요");

		int bookId = sc.nextInt();
		Member member = memberList.get(memberId);
		try {
			Book book = bookList.get(bookId);

			if (book.getCurrentOwnerId() == memberId) {
				// book에서 canBorrow를 변경해야함
				book.setCanBorrow(true);
				book.setCurrentOwnerId(-1);

				System.out.println("<반납 완료>\n" + member.getName() + "님이 " + book.getName() + "을 반납했습니다.");
				return;
			} else {
				System.out.println("<반납 실패, 회원님이 대출 중인 도서가 아닙니다.>");
				return;
			}

		} catch (Exception e) {
			System.out.println("<반납 실패>");
			return;
		}

	}

	// 책 연장
	public void extendBook(Scanner sc, int memberId) {
		// book에서

		System.out.println("\n<대출 연장>\n대출 연장하고 싶은 책 번호를 입력해주세요");

		int bookId = sc.nextInt();
		Member member = memberList.get(memberId);
		try {
			Book book = bookList.get(bookId);

			if (book.getCurrentOwnerId() == memberId && member.getHistory().get(bookId).getIsExtended() == false) {

				ArrayList<History> history = member.getHistory();
				for (History h : history) {
					if (h.getBook() == book) {
						h.setDeadLine(h.getDelayedDeadLine());
						h.setIsExtended(true);
					}
				}

				System.out.println("<연장 완료>\n" + book.getName() + "이 연장됐습니다.");
				return;
			} else {
				System.out.println("<연장 실패, 회원님이 대출 중인 도서가 아닙니다.>");
				return;
			}

		} catch (Exception e) {
			System.out.println("<연장 실패>");
			return;
		}

	}

	public ArrayList<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(ArrayList<Member> memberList) {
		this.memberList = memberList;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public ArrayList<History> getBorrowHistory() {

		return borrowHistory;
	}

	public void setBorrowHistory(ArrayList<History> borrowHistory) {
		this.borrowHistory = borrowHistory;
	}

}
