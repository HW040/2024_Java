package com.green.day04.ch05.ch06;

public class MIssionMethod {
    static void printStar(int star){
        for (int i = 0; i < star; i++) {
            System.out.printf("*");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        printStar(5); //*****
        printStar(2); //**
    }
}
