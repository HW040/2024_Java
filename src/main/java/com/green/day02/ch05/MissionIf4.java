package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101); //0~100사이의 랜덤값 나올 수 있도록 세// 팅
        System.out.printf("score: %d\n", score);

        /*
            100점이면 A+
            98점 이상이면 A+
            94점이상 97이하 A0
            90점이상 93이하 A-

            88점 이상 89이하 B+
            84점 이상 87점이하 B0
            80점 이상 83이하 B-

            78점 이상 79이하 B+
            74점 이상 77점이하 B0
            70점 이상 73이하 B-

            나머지 D
         */
        if (score >= 98) {
            System.out.printf("A+");
        } else if (score >= 94) {
            System.out.printf("A0");
        } else if(score >= 90) {
            System.out.printf("A-");
        } else if(score >= 88) {
            System.out.printf("B+");
        } else if(score >= 84) {
            System.out.printf("B0");
        } else if(score >= 80) {
            System.out.printf("B-");
        } else if(score >= 78) {
            System.out.printf("C+");
        } else if (score >= 74) {
            System.out.printf("C0");
        } else if (score >= 70) {
            System.out.printf("C-");
        } else {
            System.out.printf("D");




        }
    }
}
