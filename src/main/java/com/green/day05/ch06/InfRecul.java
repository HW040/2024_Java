package com.green.day05.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }

    public static void showHi(int cnt) {
        System.out.println("Hi ~~ ");
        if (cnt == 1) {
            return;
        }
        //showH1(cnt--); //X
        //showH1(--cnt); // O
        showHi(cnt - 1); // O
    }
}
