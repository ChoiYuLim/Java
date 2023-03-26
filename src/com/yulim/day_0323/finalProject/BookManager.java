package com.yulim.day_0323.finalProject;

import java.util.ArrayList;

public class BookManager implements CRUD<Book> {
    ArrayList<Book> list = new ArrayList<>();

    // 모든 책 리스트 가져오기
    public ArrayList<Book> getList() {
        return list;
    }

    // 책 빌릴 수 있는지 없는지 변경
    public void changeAvailability() {

    }

    @Override
    public void create(Book newBook) {
        list.add(newBook);
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
