package com.green.day05.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showH1(3);
    }
    public static void showH1(int cnt) {
        System.out.println("Hi ~~ ");
        if(cnt == 1) {
            return;
        }
        //showH1(cnt--); //X
        //showH1(--cnt); // O
        showH1(cnt - 1); // O
    }
}
