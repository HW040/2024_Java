package com.green.day09.ch13;

public class MyArrays {

    public static String toString(int[] arr) {
        StringBuilder sb = new StringBuilder("");
        int lastIdx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i == lastIdx) {
                break;
            }
        sb.append(", ");
        }
        return "[" + sb + "]";
    }

    public static String toString3(int[] arr) {
       if(arr.length == 0) {
           return "[]";
       }
       StringBuilder sb = new StringBuilder("[");
       sb.append(arr[0]);
       for (int i=1; i<arr.length; i++) {
           sb.append(", ");
           sb.append(arr[i]);
       }
       return sb.append("]").toString();
    }
    public static int[] copyOf(int[] arr3) {
        int[] copyOf = new int[arr3.length];

        for (int i = 0; i < arr3.length; i++) {
            copyOf[i] = arr3[i];
        }
        return copyOf;
    }
    public static int[] copyOf(int[] arr4, int a ) {
        int[] copyOf = new int[a];
        for (int i = 0; i < a; i++) {
            copyOf[i] = arr4[i];
        }
        return copyOf;
    }


}

