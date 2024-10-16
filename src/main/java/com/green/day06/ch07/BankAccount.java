package com.green.day06.ch07;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("balance: %d", balance);
        System.out.println();
    }
}
