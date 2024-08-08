package com.BankAccount;

import java.util.Scanner;

public class BankingSystem {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        BankAccount account = new BankAccount("123456789", 0); // Create a bank account with an initial balance

	        while (true) {
	            System.out.println("Banking System Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	             System.out.println("3. Balance Inquiry");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 3:
	                    System.out.println("Current balance: $" + account.getBalance());
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return; // Exit the loop and end the program
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	    }
	}


