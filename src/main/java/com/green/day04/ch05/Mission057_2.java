package com.green.day04.ch05;

public class Mission057_2 {
    public static void main(String[] args) {
        /*
            다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자

            A B
          + B A
         -------
            ? ?
         */for (int a = 0; a < 9; a++) {
             for(int b =0; b <9; b++) {
                 if( (a * 11) + (b * 11) == 99 ){
                     System.out.printf("A : %d, B : = %d\n",a, b);
                 }
             }
        }
    }
}
