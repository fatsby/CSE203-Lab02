package org.example;

import java.util.Scanner;

public class BankAccount {
    private int mAccNum;
    private String mName;
    private double mBalance;
    private final Scanner sc = new Scanner(System.in);

    public BankAccount() {}

    public BankAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public void createAccount(){
        System.out.println("Creating new account.");
        System.out.println("Account number: ");
        this.mAccNum = sc.nextInt();
        System.out.println("Name: ");
        this.mName = sc.next();
        System.out.println("Balance: ");
        this.mBalance = sc.nextDouble();
    }

    public double getBalance() {
        return mBalance;
    }

    public String getName() {
        return mName;
    }

    public int getAccNum() {
        return mAccNum;
    }

    public void setAccNum(int mAccNum) {
        this.mAccNum = mAccNum;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public void setBalance(double mBalance) {
        this.mBalance = mBalance;
    }
    public void deposit(double amount) {
        mBalance += amount;
        System.out.println("New balance: " + mBalance);
    }
    public boolean withdraw(double amount) {
       if(amount<0) return false;
       if(amount>mBalance) return false;
       else{
           mBalance -= amount;
           System.out.println("New balance: " + mBalance);
           return true;
       }
    }
    public boolean transfer(BankAccount acc2, double amount) {
        if (mBalance >= amount) {
            acc2.deposit(amount);
            //mBalance -= amount;
            this.withdraw(amount);
            System.out.println("Transfer successful");
            System.out.println("Destination Balance: " + acc2.getBalance());
            System.out.println("Your Balance: " + this.mBalance);
            return true;
        } else{
            System.out.println("Insufficient amount of money");
            return false;
        }
    }
    public void print(){
        System.out.println("Account Number: " + mAccNum);
        System.out.println("Name: " + mName);
        System.out.println("Balance: " + mBalance);
        System.out.println();
    }

}
