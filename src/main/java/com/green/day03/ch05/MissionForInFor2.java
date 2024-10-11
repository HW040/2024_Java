package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int z = 2; z < 10; z++) {
                System.out.printf("%d * %d = %d\t", z, i, i * z);
            }
            System.out.println();
        }
    }
}
