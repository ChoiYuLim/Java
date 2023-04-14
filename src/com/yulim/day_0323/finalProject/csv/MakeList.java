package com.yulim.day_0323.finalProject.csv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import com.yulim.day_0323.finalProject.entity.Book;
import com.yulim.day_0323.finalProject.entity.Loan;
import com.yulim.day_0323.finalProject.entity.Member;

public class MakeList {

    CsvReader cr = new CsvReader();

    // bookList 만들기
    public ArrayList<Book> bookList() {

        ArrayList<List<String>> list = cr.readCSV("Books.csv");
        ArrayList<Book> bookList = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            List<String> l = list.get(i);
            Book book = new Book(l.get(1), l.get(2), l.get(3), Boolean.valueOf(l.get(4)),
                    Integer.parseInt(l.get(5)));
            bookList.add(book);
        }
        return bookList;
    }

    public ArrayList<Member> memberList() {
        ArrayList<List<String>> list = cr.readCSV("Members.csv");
        ArrayList<Member> memberList = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            List<String> l = list.get(i);
            Member member = new Member(l.get(1), l.get(2), l.get(3), l.get(4), l.get(5), l.get(6));
            memberList.add(member);
        }
        return memberList;
    }

    public ArrayList<Loan> loanList() {
        ArrayList<List<String>> list = cr.readCSV("Loan.csv");
        ArrayList<Loan> loanList = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            List<String> l = list.get(i);
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

            try {
                Loan loan = new Loan(Integer.parseInt(l.get(0)), l.get(1),
                        Integer.parseInt(l.get(2)), format.parse(l.get(3)), format.parse(l.get(4)),
                        Boolean.valueOf(l.get(5)), Boolean.valueOf(l.get(6)));
                loanList.add(loan);
            } catch (NumberFormatException | ParseException e) {
                e.printStackTrace();
            }
        }
        return loanList;
    }
}
