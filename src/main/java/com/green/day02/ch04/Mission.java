package com.green.day02.ch04;

public class Mission {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
                    //int / int 결과타입도 int이기 때문에 실수값이 날아간다.

        System.out.printf("n1 / n2 %f\n", (float) n1 / n2);


        //n1 / n2 sksntutj 3.33333 나올 수 있도록 해주세요.
        System.out.println(n1 / n2);

        float a1 = 3;
        System.out.println("a1: " + a1);
        // int / int 결과타입도 int이기 때문에 실수값이 날아간 3이 float에 저장된 것

        float a2 = (float)n1 / n2;
        System.out.println("a1: " + a2); //float / int >> float / float >>  결과타입도 float이다. 실수값도 살아있다.
    }
}
