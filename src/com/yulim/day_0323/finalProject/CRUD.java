package com.yulim.day_0323.finalProject;

public interface CRUD<E> {

    int create(E e);

    void read();

    void update(int i, E e);

    void delete(int i);

}
