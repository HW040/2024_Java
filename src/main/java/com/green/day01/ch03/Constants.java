package com.green.day01.ch03;

public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        CONST_ASSIGNED =12;

        System.out.printf("상수1: %d\n", MAX_SIZE);
        System.out.printf("상수2: %c\n", CONST_CHAR);
        System.out.printf("상수3: %d\n", CONST_ASSIGNED);

        final int max_size = 200;
        final char const_char = '하';
        final int const_assigned;

        const_assigned =15;

        System.out.printf("하1: %d\n", max_size);
        System.out.printf("하2: %c\n", const_char);
        System.out.printf("하3: %d\n", const_assigned);

    }
}
