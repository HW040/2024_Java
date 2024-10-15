package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student(); //s1객체
        s1.setName("홍길동");
        System.out.println(s1.getName());
        Student s2 = new Student(); //s2객체
        s2.setName("신사임당");
    }
}

class Student {
    private String name;
    private int age;
    private float height;

    //this는 상수이고 나 자신의 주소값이 저장된 공간
    //name-setter
    public void setName(String name) {
        this.name = name;
    }

    //name-getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public void setAge(int age) { //set은 파라미터 필수
        this.age = age;
    }
}
