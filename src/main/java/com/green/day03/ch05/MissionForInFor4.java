package com.green.day03.ch05;

import java.util.Scanner;

public class MissionForInFor4 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;
        System.out.println(star);
        for (int i = 1; i <= star; i++) {
            for (int z = 0; z < star; z++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        int len = star * star;
        for (int i = 1; i < len; i++) {
            if (i % star == 0) {
                System.out.println();
                System.out.print("*");
            }
        }

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for (int i = 1; i <= s; i++) {

            for (int z = 0; z < i; z++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }

}
