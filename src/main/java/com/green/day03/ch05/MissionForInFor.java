package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int c = 1; c < 10; c++) {
                System.out.printf("%d * %d = %d\n", i, c, i * c);
            }
            System.out.println();
        }
    }
}
