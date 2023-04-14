package com.yulim.day_0323.finalProject.csv;

import java.util.ArrayList;
import java.util.List;
import com.yulim.day_0323.finalProject.Util;
import com.yulim.day_0323.finalProject.entity.Book;
import com.yulim.day_0323.finalProject.entity.Loan;
import com.yulim.day_0323.finalProject.entity.Member;


public class ExportList {

    CsvWriter csvwriter = new CsvWriter();

    public void exportMember(List<Member> memberlist) {
        List<String[]> export = new ArrayList<>();
        String[] index = {"id", "name", "gender", "birth", "address", "phone", "joinDate"};
        export.add(index);
        for (int i = 0; i < memberlist.size(); i++) {
            String[] member = new String[7];
            member[0] = String.valueOf(memberlist.get(i).getId());
            member[1] = memberlist.get(i).getName();
            member[2] = memberlist.get(i).getGender();
            member[3] = memberlist.get(i).getBirth();
            member[4] = memberlist.get(i).getAddress();
            member[5] = memberlist.get(i).getPhone();
            member[6] = memberlist.get(i).getJoinDate();
            export.add(member);
        }
        csvwriter.writeCSV(export, "Members.csv");
    }

    public void exportBook(List<Book> booklist) {
        List<String[]> export = new ArrayList<>();
        String[] index = {"id", "name", "author", "publishedDate", "canBorrow", "currentOwnerId"};
        export.add(index);
        for (int i = 0; i < booklist.size(); i++) {
            String[] book = new String[6];
            book[0] = String.valueOf(booklist.get(i).getId());
            book[1] = booklist.get(i).getName();
            book[2] = booklist.get(i).getAuthor();
            book[3] = String.valueOf(booklist.get(i).getPublishedDate());
            book[4] = String.valueOf(booklist.get(i).getCanBorrow());
            book[5] = String.valueOf(booklist.get(i).getCurrentOwnerId());
            export.add(book);
        }
        csvwriter.writeCSV(export, "Books.csv");
    }

    public void exportLoan(List<Loan> loanlist) {
        List<String[]> export = new ArrayList<>();
        String[] index = {"bookId", "bookName", "memberId", "borowDate", "deadLine", "isExtended",
                "isReturned"};
        export.add(index);
        for (int i = 0; i < loanlist.size(); i++) {
            String[] loan = new String[7];
            loan[0] = String.valueOf(loanlist.get(i).getBookId());
            loan[1] = loanlist.get(i).getBookName();
            loan[2] = String.valueOf(loanlist.get(i).getMemberId());
            loan[3] = Util.formattedDateToString(loanlist.get(i).getBorrowDate());
            loan[4] = Util.formattedDateToString(loanlist.get(i).getDeadLine());
            loan[5] = String.valueOf(loanlist.get(i).getIsExtended());
            loan[6] = String.valueOf(loanlist.get(i).getIsReturned());
            export.add(loan);
        }
        csvwriter.writeCSV(export, "Loan.csv");
    }

}
