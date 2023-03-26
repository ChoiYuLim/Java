package com.yulim.day_0323.finalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Member> memberList = new ArrayList<>();
    private ArrayList<Book> bookList = new ArrayList<>(); // 도서관의 모든 책들을 가지고 있어


    // 책 대출
    public void borrowBook(Scanner sc, int memberId) {
        System.out.println("\n<도서 대출>\n빌리고 싶은 책 번호를 입력해주세요");

        int bookId = sc.nextInt();
        Member member = memberList.get(memberId);
        Book book = bookList.get(bookId);

        try {
            if (book.getCanBorrow() == true) {
                // history에 저장해야함

                // member.addHistory(book);

                // book에서 canBorrow를 변경해야함
                book.setCanBorrow(false);

                book.setCurrentOwnerId(memberId);

                System.out.println(
                        "\n<대출 완료>\n" + member.getName() + "님이 " + book.getName() + "을 대출했습니다.");
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

                System.out.println(
                        "<반납 완료>\n" + member.getName() + "님이 " + book.getName() + "을 반납했습니다.");
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
        // try {
        Book book = bookList.get(bookId);

        String deadLine = null;

        // if (book.getCurrentOwnerId() == memberId) {
        //
        // ArrayList<History> history = member.getHistory();
        // for (History h : history) {
        // if (h.getBook() == book && h.getIsExtended() == false) {
        // h.setDeadLine(h.getDelayedDeadLine());
        // h.setIsExtended(true);
        // deadLine = Util.formattedDateToString(h.getDeadLine());
        // break;
        // } else {
        // System.out.println("<연장 실패>");
        // return;
        // }
        // }
        // System.out.println("<연장 완료>\n" + book.getName() + "이 " + deadLine + "까지 연장됐습니다.");
        // return;
        // } else {
        // System.out.println("<연장 실패>");
        // return;
        // }

    }

}
