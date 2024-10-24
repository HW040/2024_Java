package com.green.day13;


public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        //arr = new int[0]; [2, 3, 4] 출력
        clear();
        arr = new int[0];

    }

    public int size() {
        return arr.length;
    }

    public void clear() {
        arr = new int[0];
    }

    public void add(int i) {
        int[] tmp = new int[arr.length + 1];

        tmp[arr.length] = i;
        for (int j = 0; j < arr.length; j++) {
            tmp[j] = arr[j];
        }
        tmp[arr.length] = i;
        arr = tmp;
    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public int remove() {
        int[] tmp = new int[arr.length - 1];
        for (int j = 0; j < tmp.length; j++) {
            tmp[j] = arr[j];
        }
        int n1 = arr[arr.length -1];
        arr = tmp;
        return n1;
    }
}

