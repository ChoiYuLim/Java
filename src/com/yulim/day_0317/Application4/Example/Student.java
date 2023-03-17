package com.yulim.day_0317.Application4.Example;

import java.util.Objects;

public class Student implements Comparable<Student> {

    public Student(String name, int id) {
        this.name = name;
    }

    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return id == other.id;
    }

    // implements 했을 때 오버라이딩 해야할 것 compare to
    @Override
    public int compareTo(Student o) {
        // return (id < o.id) ? -1 : ((id == o.id) ? 0 : 1); // id순 정렬
        return this.name.compareTo(o.name); // 이름 순으로 정렬
        // return this.name.compareTo(o.name) * -1; //이름 순으로 역순으로 정렬

    }

    
    // 근데 만약에 정렬 기준을 바꾸고 싶으면, 이렇게 안함
    // 여기서 하나 정해놓고 이렇게 안 씀


    // @Override
    // public String toString() {
    // return "Student [name=" + name + "]";
    // }
    //
    // // 굳이 하나를 빼놓지 않고 거의 대부분 hashcode와 equals를 모두 재정의함
    //
    // @Override
    // public int hashCode() {
    // return Objects.hash(name);
    // }
    //
    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Student other = (Student) obj;
    // return Objects.equals(name, other.name);
    // }



}
