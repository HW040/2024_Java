package com.green.day02.ch05;

public class MissionIf4Result3 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101); //0~100사이의 랜덤값 나올 수 있도록 세// 팅
        System.out.printf("score: %d\n", score);

        String geade = "D", opt = "";
        int gradeScore = score / 10;

        switch (gradeScore) {
            case 9, 10:
                geade = "A";
                break;
            case 8:
                geade = "B";
                break;
            case 7:
                geade = "C";
                break;
        }
        int optScore = score % 10;
        {
            //98 % 10 >> 8
            //88 % 10 >> 8
            //76 % 10 >> 6
            if (gradeScore >= 8 || score == 100) {
                opt = "+";
            } else if (optScore >= 4) {
                opt = "0";
            } else {
                opt = "-";
            }
        }
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


    }
}
