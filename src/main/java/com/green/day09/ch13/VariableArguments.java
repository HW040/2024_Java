package com.green.day09.ch13;

public class VariableArguments {
    //가변 인수 (가변 인자)
    public static void main(String[] args) {
        sum(10, 22); //3

        sum(10, 22, 33); // 65
        sumVqr(1);
        sumVqr(1, 2);
        sumVqr(1, 2, 3);
        sumVqr(1, 2, 3, 4, 5, 6);

    }

    static void sumVqr(int... values) {   //배열로 변환이 되어서 파라미터로 들어온다.
        int arr = 0;
        for (int i = 0; i < values.length; i++) { // 배열은 항상 이 구조가 나와야 한다
            arr += values[i];

        }
        System.out.println(arr);
    }

    public static void sum(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        System.out.println(sum);
    }

    static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }
}
