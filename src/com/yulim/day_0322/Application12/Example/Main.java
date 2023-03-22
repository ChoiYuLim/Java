package com.yulim.day_0322.Application12.Example;

import java.util.ArrayList;
import java.util.List;

interface OnClickEvent {
    void onClick();
}


class Button {
    OnClickEvent listener;

    public Button(OnClickEvent listener) {
        this.listener = listener;
    }

    void click() {
        listener.onClick();
    }
}


public class Main {
    public static void main(String[] args) {
        Button addBtn = new Button(new OnClickEvent() {
            @Override
            public void onClick() {
                System.out.println("클릭");

            }
        });
        addBtn.click();
        Button btn2 = new Button(new OnClickEvent() {
            @Override
            public void onClick() {
                System.out.println("클릭");

            }
        });
        
        List<Button> btns  = new ArrayList<>();
        btns.add(addBtn);
        btns.add(btn2);
        
        btns.stream().forEach(e -> e.click());
    }


}
