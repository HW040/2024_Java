package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (w/m)");
        String gender = scan.next();
        System.out.print("키를 정수값으로 입력해 주세요.(cm)");
        int K = scan.nextInt();

        switch (gender) {
            case "w":
                if (K > 159) {
                    System.out.println("당신은 평균보다 큽니다");
                } else if (K == 159) {
                    System.out.println("당신은 평균입니다");
                } else {
                    System.out.println("당신은 평균보다 작습니다");
                }
                break;
            case "m":
                if (K > 172) {
                    System.out.println("당신은 평균보다 큽니다");
                } else if (K == 172) {
                    System.out.println("당신은 평균입니다");
                } else {
                    System.out.println("당신은 평균보다 작습니다");
                }
                break;
        }

        switch (gender) {
            case "m":
                if (K > 172) {
                    System.out.println("당신은 평균보다 큽니다");
                } else if (K < 172) {
                    System.out.println("당신은 평균보다 작습니다");
                } else {
                    System.out.println("당신은 평균입니다");
                }
                break;
            case "w":
                if (K > 159) {
                    System.out.println("당신은 평균보다 큽니다");
                } else if (K < 159) {
                    System.out.println("당시은 평균보다 작습니다");
                } else {
                    System.out.println("당신은 평균 입니다");
                }
                break;
        }
    }
}
