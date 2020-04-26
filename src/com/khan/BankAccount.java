package com.khan;

public class BankAccount {
    private double accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    // Getters
    public double getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    // Setters
    public void setAccountNumber(double accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // Deposit
    public void deposit(double funds){
        balance += funds;
        System.out.println(balance);
    }
    // WithDraw
    public void withDraw(double funds){
        if(balance > funds) {
            balance -= funds;
            System.out.println(balance);
        }
    }

}
