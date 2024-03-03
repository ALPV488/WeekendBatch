package com.casestudy;

import java.util.HashMap;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		long accNo;

		String accHolderName;

		long contactNo;

		String typeOfAccount;

		float accBal=0;

		boolean value = true;
		
		Account account;

		while (value) {

			System.out.println("Welcome to the Bank Application");
			System.out.println("****************************");

			System.out.println();
			System.out.println("1.Create a new bank Account");

			System.out.println("2.Check Balance");

			System.out.println("3.Deposit");

			System.out.println("4.Withdraw");

			System.out.println("5.FundTransfer");

			System.out.println("6.Bank Statement");
			
			System.out.println("7.Check Account details");

			System.out.print("Please enter your option:-");

			int option = scan.nextInt();

			switch (option) {
			case 1: {
				System.out.println("********ACCOUNT REGISTRATION********");

				System.out.print("Enter your name:-");
				accHolderName = scan.next();
				
				System.out.print("Enter your contact number:-");
				contactNo = scan.nextLong();
				
				System.out.print("Enter your type of account:-");
				typeOfAccount=scan.next();
				
				accNo = contactNo-100000;
				
				account = new Account(accNo,accHolderName,contactNo,typeOfAccount,accBal);
				
				accounts.put(accNo,account);
				
				System.out.println("Congrats your account is created successfully with the account no:-"+accNo);
				
			

				break;

			}
			case 2: {
				System.out.println("********CHECK BALANCE********");
				break;
			}
			case 3: {

				System.out.println("********DEPOSIT********");
				break;
			}
			case 4: {
				System.out.println("********WITHDRAW********");
				break;
			}
			case 5: {
				System.out.println("********FUND TRANSFER********");
				break;
			}
			case 6: {
				System.out.println("********BANK STATEMENT********");
				break;
			}
			
			case 7: {
				System.out.println("********ACCOUNT DETAILS CHECK********");
				
				System.out.print("Enter your account number:-");
				long key=scan.nextLong();
				
				System.out.println(accounts.get(key));
				
				value = false;
				
				break;
			}
			default: {
				System.out.println("Thank you...Please visit us again");
				value = false;
				break;
			}
			}

		}

	}
	}


