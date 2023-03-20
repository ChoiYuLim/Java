package com.yulim.day_0316.application.Example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("이동학");
        strs.add("박경덕");
        strs.add("강태근");
        strs.add("최유림");

        Collections.sort(strs);
        System.out.println(strs);
        
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(1);
        nums.add(8);
        nums.add(2);
        Collections.sort(nums);
        System.out.println(nums);
        
        
        List<Student> students = new ArrayList<>();

        students.add(new Student("이동학", 0));
        students.add(new Student("최유림", 3));
        students.add(new Student("박경덕", 1));
        students.add(new Student("강태근", 2));
        

        //Collections.sort(students); // 내가 만든 건 무슨 순서인지 모르기 때문에 오류남
        System.out.println(students);
    }

}
