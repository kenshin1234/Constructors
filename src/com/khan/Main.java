package com.khan;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        BankAccount sulman = new BankAccount();

        sulman.setAccountNumber(123456789);
        sulman.setBalance(500.00);
        sulman.setName("Sulman Khan");
        sulman.setEmail("kenshin796@gmail.com");
        sulman.setPhoneNumber("518-786-3633");

        System.out.println("Account Number: " + sulman.getAccountNumber());
        System.out.println("Balance: " + sulman.getBalance());
        System.out.println("Name: " + sulman.getName());
        System.out.println("Email: " + sulman.getEmail());
        System.out.println("Phone Number: " + sulman.getPhoneNumber());
        sulman.deposit(250.00);
        sulman.withDraw(600.00);
    }
}
