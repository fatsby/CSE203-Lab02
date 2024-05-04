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
    public  List<BankAccount> createAccount() {
        List<BankAccount> createdAccounts = new ArrayList<>();
        System.out.print("How many accounts do you wish to create?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount account = new BankAccount();
            account.createAccount();
            accounts.add(account);
            createdAccounts.add(account);
        }
        return createdAccounts;
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
}
