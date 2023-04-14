package com.yulim.day_0323.finalProject;

import com.yulim.day_0323.finalProject.csv.MakeList;

public interface CRUD<E> {
    MakeList ml = new MakeList();

    int create(E e);

    void read();

    void update(int i, E e);

    void delete(int i);

}
