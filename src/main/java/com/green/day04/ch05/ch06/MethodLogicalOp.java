package com.green.day04.ch05.ch06;

public class MethodLogicalOp {

    public static void main(String[] args) {
        int n1 = 111;
        boolean b = logicalOp1(n1);
        System.out.println("b: " + b);
        boolean b2 = logicalOp2(n1);
        System.out.println("b2: " + b2);
    }

    public static boolean logicalOp1(int n1) {
        return (n1 >= 1 && n1 <= 100);
    }

    static boolean logicalOp2(int n1) {
        return (n1 % 2 == 0) || (n1 % 3 == 0);
    }

}
