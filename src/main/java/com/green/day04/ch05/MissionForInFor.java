package com.green.day04.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;
        System.out.println(star);
        for (int i = 0; i < star; i++) {
            for (int j = star - 1; j > i; j--) { // star 앞 _를 -1로 한칸씩 줄인다
                System.out.print("_");         // star 앞에 _ 출력
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
