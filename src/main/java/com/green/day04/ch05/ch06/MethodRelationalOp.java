package com.green.day04.ch05.ch06;

public class MethodRelationalOp {
    public static void main(String[] args) {
        int n1 = 22, n2 = 22;
        biggerNumber(n1,n2); // 더 큰 값은 22입니다
        biggerNumber(30,11); //더 큰값은 30 입니다.

        if(isEquuals(n1, n2)) { //if문 boolean
            System.out.printf("%d와 %d 값은 같습니다.",n1,n2);
        }
    }
    public static void biggerNumber(int n1, int n2) {   //더큰 값 출력
        System.out.printf("더 큰 값은 %d 입니다.\n",(n1 > n2 ? n1 : n2));
    }
    public static boolean isEquuals(int n1, int n2) { //같은 결과값 리턴
        return n1 == n2;
    }
}
