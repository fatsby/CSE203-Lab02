package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//       Complex num = new Complex(1,2);
//       Complex num2 = new Complex(3,4);
//
//       num.add(num2).print();
//       num.mul(num2).print();
//       num.sub(num2).print();
//       num.div(num2).print();
        Scanner sc = new Scanner(System.in);
    Bank bank = new Bank();
    List<BankAccount> accounts = bank.createAccount();
    System.out.println("Enter account number: ");
    int accNum = sc.nextInt();
    BankAccount newAccount = bank.getAccountByNumber(accNum);
    newAccount.deposit(100);


    }
}