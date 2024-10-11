package com.green.day04.ch05;

public class MissionForInFor4 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;      //별찍기 줄 수 결정
        System.out.println(star);           // star 랜덤값 확인
        for(int i = 0 ; i < star; i++) {    // 몇번째 줄
            for (int j = star; j > i ; j--) {   //
                System.out.print(" ");      //
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= star; i++) {
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();        }
    }
}
