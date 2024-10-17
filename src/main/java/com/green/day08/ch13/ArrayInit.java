package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[5];
        /*
        0: 10
        1: 20
        2: 30
        3: 40
        4: 50
         */
        for (int i=0; i<arr.length; i++){
            arr[i] = (i + 1) * 10;
        }

        for(int i=0; i<arr.length; i++) {
        System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
        int[] aff = new int[5];

        for(int i=0; i<aff.length; i++) {
            aff[i] =(i + 1) * 2;
            System.out.printf("aff[%d]: %d\n", i, aff[i]);
        }

        }

    }

