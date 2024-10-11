package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 떄) 1,000을
            넘어서는지, 그리고 1,000을 넘어선 값을 얼마가
            되는지 계산하여 출력하는 프로그램을 작성해보자.
         */
        int ryu = 0;
        int n = 1;

        while (true) {

            if (n % 2 == 1) {
                ryu += n;
            }

            if (ryu >= 1000) {
                System.out.printf("ryu : %d\n", ryu, n);
                break;
            }

            n++;
        }
        int i = 1;
        int odd = 0;
        while (true) {
            i++;
            if ((i % 2) == 1) {
                System.out.println("i: " + i);
                odd += i;
                if(odd >= 1000){
                    break;
                }
                i +=2;
            }
        }
        System.out.printf("마지막 더한값: %d\n", i);
        System.out.println("odd: " + odd);
    }

}
