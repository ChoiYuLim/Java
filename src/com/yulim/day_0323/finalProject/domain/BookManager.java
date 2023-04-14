package com.yulim.day_0323.finalProject.domain;

import java.util.ArrayList;
import com.yulim.day_0323.finalProject.CRUD;
import com.yulim.day_0323.finalProject.entity.Book;

public class BookManager implements CRUD<Book> {

    public ArrayList<Book> list = ml.bookList();

    // 모든 책 리스트 가져오기
    public ArrayList<Book> getList() {
        return list;
    }

    // Id값으로 책 반환
    public Book findBook(int id) {
        for (Book book : list) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // 책 빌릴 수 있는지 없는지 변경
    public void changeAvailability(int id) {
        list.get(id).setCanBorrow(!list.get(id).getCanBorrow());
    }

    @Override
    public int create(Book newBook) {
        list.add(newBook);
        return newBook.getId();
    }

    // 최근 출간 순으로 빌릴 수 있는 책만 조회
    @Override
    public void read() {
        list.stream().filter(i -> i.getCanBorrow() == true)
                .forEach(book -> System.out.println(book.toString()));
    }

    @Override
    public void update(int id, Book changeBook) {
        list.set(id, changeBook);
    }

    @Override
    public void delete(int id) {
        list.remove(id);
    }


}
