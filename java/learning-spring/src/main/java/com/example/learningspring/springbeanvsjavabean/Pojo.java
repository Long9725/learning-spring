package com.example.learningspring.springbeanvsjavabean;

// Plain old java object
// 모든 자바 객체는 POJO이다.
class Pojo {
    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }
}
