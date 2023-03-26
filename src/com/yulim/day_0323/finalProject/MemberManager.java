package com.yulim.day_0323.finalProject;

import java.util.ArrayList;
import java.util.Collections;

public class MemberManager implements CRUD<Member> {

    ArrayList<Member> list = new ArrayList<>();

    public ArrayList<Member> getList() {
        return list;
    }

    // 회원 가입
    @Override
    public int create(Member newMember) {
        list.add(newMember);
        return newMember.getId();
    }

    // id순으로 전체 조회
    @Override
    public void read() {
        // Collections.sort(list);
        for (Member m : list) {
            System.out.println(m.toString());
        }

    }

    // 회원 수정
    @Override
    public void update(int id, Member changeMember) {
        list.set(id, changeMember);
    }

    // 회원 삭제
    @Override
    public void delete(int id) {
        list.remove(id);
    }

    // 삭제 취소
    public void redo() {

    }

    // id 값으로 멤버 정보 반환
    public Member findMember(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }

}
