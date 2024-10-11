package com.green.day03.ch05;

public class MissionForInFor3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int z = 1; z < 10; z++) {
                System.out.printf("%d * %d = %d\n",i,z, i * z);
            }
            System.out.println();
        }
    }
}

