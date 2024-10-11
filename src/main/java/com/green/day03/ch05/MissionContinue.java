package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 5 != 0 || i % 7 != 0) {
                continue;
            }
            count++;
            System.out.printf("n : %d\n", i);
        }
        System.out.printf("cont : %d\n", count);
    }
}
