package com.green.day04.ch05;

public class Mission05_7_1 {
    public static void main(String[] args) {
        /*
            1번 구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을
            작성하되
            2단은 2 X 2까지,
            4단은 4 X 4까지,
            6단은 6 X 6까지,
            8단은 8 x 8까지,
            출력하도록 작성하자.
         */
        for (int i = 0; i < 9; i +=2) {
            for (int z = 1; z < 10; z++) {
                if (z <= i) {
                    System.out.printf("%d x %d = %d\n", i, z, i * z);
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}
