package com.green.day05.ch07;

public class BankAccountPO {
    static int balance = 0; //static 전역변수 static가 붙지않은 것은 객체생성 필수

    static int deposit(int amount) { //입금을 담당하는 메소드
        //balance = balance + amount;
        balance += amount; // 위에 주석이랑 같은의미
        return balance;
    }

    static int withdraw(int amount) { //출금을 담당하는 메소드,기능
        balance = balance - amount;
        return balance;
    }

    static int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}
