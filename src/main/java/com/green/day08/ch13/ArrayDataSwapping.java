package com.green.day08.ch13;

public class ArrayDataSwapping {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        //arr[0]방의 값과 arr[2]의 값을 swapping해주세요.
        int tepm;

        tepm = arr[0];
        arr[0] = arr[2];
        arr[2] = tepm;
        System.out.println("arr[0]: %d, arr[2]: %d");

    }
}
