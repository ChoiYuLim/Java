package com.yulim.day_0323.finalProject.service;

import java.util.ArrayList;
import java.util.stream.Collectors;
import com.yulim.day_0323.finalProject.csv.MakeList;
import com.yulim.day_0323.finalProject.entity.Loan;
import com.yulim.day_0323.finalProject.util.DateUtil;

public class LoanManager {
    
    MakeList ml = new MakeList();
    public ArrayList<Loan> list = ml.loanList();

    public ArrayList<Loan> getList() {
        return list;
    }

    // 책 id, 회원 id로 현재 빌리고 있는 책 찾기
    public Loan findLoan(int bookId, int memberId) {
        return list.stream().filter(i -> i.getIsReturned() == false && i.getBookId() == bookId
                && i.getMemberId() == memberId).collect(Collectors.toList()).get(0);
    }

    // 특정 회원의 모든 대출 이력
    public void readAllBook(int memberId) {
        if (list.size() == 0) {
            System.out.println("대출 이력이 없습니다.");
        }
        for (Loan loan : list) {
            if (loan.getMemberId() == memberId) {
                System.out.println(loan);
            }
        }
    }

    // 특정 회원의 현재 대출 중인 책
    public void readNowBook(int memberId) {
        for (Loan loan : list) {
            if (loan.getMemberId() == memberId && loan.getIsReturned() == false) {
                System.out.println(loan);
            }
        }
    }

    // 책 대출
    public void loanBook(Loan loan) {
        list.add(loan);
        loan.setIsReturned(false);
    }

    // 책 반납
    public void returnBook(Loan loan) {
        loan.setIsReturned(true);
    }

    // 반납 연기
    public void extendBook(Loan loan) {
        loan.setIsExtended(true);
        loan.setDeadLine(DateUtil.addDate(loan.getDeadLine(), 7));
    }
}
