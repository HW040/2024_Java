package com.green.day04.ch05.ch06;

public class MethodGugdan {

    static void gugudanFromTo(int dan, int dam) {
        for (int i = dan; i <= dam; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
        }
    }

    public static void main(String[] args) {
        gugudan(4);
        gugudan(6);
        gugudanFromTo(5, 9);
        gugudanFromTo(2, 4);
    }

    static void gugudan(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));

        }
    }

}
