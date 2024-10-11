package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101); //0~100사이의 랜덤값 나올 수 있도록 세// 팅
        System.out.printf("score: %d\n", score);

        /*
        score 값이 90이상이면 A출력
                  80이상이면 B출력
                  ~
                  나머지 D출력
         */

        if (score >= 90) {
            System.out.printf("A");
        } else if (score >= 80){
            System.out.printf("B");
        } else if (score >= 70) {
            System.out.printf("C");
        } else {
            System.out.printf("D");
        }
    }
}
