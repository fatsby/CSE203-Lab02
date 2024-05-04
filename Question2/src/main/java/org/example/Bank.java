package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bank {
    private final ArrayList<BankAccount> accounts;
    private final Scanner sc = new Scanner(System.in);
    public Bank() {
        accounts = new ArrayList<>();
    }
    public Bank(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
    public  void createAccount() {
        System.out.print("How many accounts do you wish to create?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount account = new BankAccount();
            account.createAccount();
            accounts.add(account);

        }
    }
    public void printAccounts(){
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).print();
        }
    }
    public BankAccount getAccountByName(String name) {
        for (BankAccount account : this.accounts) {
            if (Objects.equals(account.getName(), name)) {
                return account;
            }
        }
        return null;
    }
    public BankAccount getAccountByNumber(int accountNumber) {
        for (BankAccount account : this.accounts) {
            if (account.getAccNum() == accountNumber) {
                return account;
            }
        }
        return null;
    }
    public void depositAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        BankAccount account = getAccountByNumber(accountNumber);
        account.deposit(amount);
    }
    public void withdrawAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        BankAccount account = getAccountByNumber(accountNumber);
        account.withdraw(amount);
    }
    public void transferMoney() {
        System.out.print("Enter your account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        BankAccount account = getAccountByNumber(accountNumber);
        System.out.print("Enter receiver account number: ");
        int receiverAccountNumber = sc.nextInt();
        BankAccount reiceiver = getAccountByNumber(receiverAccountNumber);
        account.transfer(reiceiver, amount);
    }
}
