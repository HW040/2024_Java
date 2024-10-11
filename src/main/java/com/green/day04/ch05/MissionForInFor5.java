package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;      //별찍기 줄 수 결정
        System.out.println(star);
        for (int i = 0; i < star; i++) {
            for (int j = star - 1; j > i; j--) {
                System.out.print("_");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

