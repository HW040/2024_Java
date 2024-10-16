package com.green.day07.ch07;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt ic1 = new InstCnt();
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
     }
}

class InstCnt {
    static int instNum;
    int value;
    InstCnt() {//기본 생성자 ()파라미터가 없어서
        instNum++;
        value++;
        System.out.println("인스턴스 생성" + InstCnt.instNum);
        System.out.println("인스턴스 생성" + instNum);
        System.out.println("value:" +value);
    }
}