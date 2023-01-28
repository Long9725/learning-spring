package com.example.learningspring.springbeanvsjavabean;

import java.io.Serializable;

// EJB - Enterprise Java Beans
// 첫번쨰 제약 - Public no argument constructor
// 두번째 제약 - getter and setter
// 세번째 제약 - serializable interface 선언, 해당 인터페이스는 빈 인터페이스이다.
class JavaBean implements Serializable {
    public JavaBean() {

    }

    private String text;
    private int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
