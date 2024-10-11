package com.green.day04.ch05.ch06;

public class MethodArithOp {

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        minus(n1, n2);
        multiply(4,5);
        float r = divide(10,3);
        int r2 = modulo(10, 4);
        System.out.println("r2 :");

    }
    static int modulo(int n1, int n2) {
        return (n1 % n2 );
    }

    public static float divide(int n1, int n2) {
        return (float)n1 / n2;
    }


    public static void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));

    }
    public static void multiply(int n1, int n2) {
        System.out.printf("%d * %d = %d\n",n1,n2,(n1 * n2));
    }
}

