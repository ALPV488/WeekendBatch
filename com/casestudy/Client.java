package com.casestudy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();
		
		HashMap<Integer,Transaction> transactions = new HashMap<Integer,Transaction>();

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
				
				System.out.print("Enter your account number:-");
				
				accNo =scan.nextLong();
				
				account = accounts.get(accNo);
				
				float Balance = account.getAccBal();
				
				System.out.println("Your account balance is:-"+Balance);
				
				break;
			}
			case 3: {

				System.out.println("********DEPOSIT********");
				
				System.out.print("Enter your account number:-");
				
				accNo = scan.nextLong();
				
				System.out.print("Enter your deposit amount:-");
				
				float depositAmount = scan.nextFloat();
				
				account = accounts.get(accNo);
				
				float existingAmount = account.getAccBal();
				
				float finalAmount = existingAmount + depositAmount;
				
				account.setAccBal(finalAmount);
				
				System.out.println("Your amount is deposited successfully ");
				
				System.out.println("Your current balance is:-"+finalAmount);
				
				LocalDate date = LocalDate.now();
				
				Random  random = new Random();
				
				int transId = random.nextInt();
				
				Transaction transaction = new Transaction(accNo, "deposit", date, 0, depositAmount, finalAmount, transId);
				
				transactions.put(transId, transaction);
				
				break;
			}
			case 4: {
				System.out.println("********WITHDRAW********");
				
				System.out.println("Enter your account number:-");
				
				accNo = scan.nextLong();
				
				System.out.println("Enter your withdrawl amount:-");
				
				float withdrawlAmount = scan.nextFloat();
				
				account = accounts.get(accNo);
				
				float existingAmount = account.getAccBal();
				
				float finalAmount = existingAmount - withdrawlAmount ;
				
				account.setAccBal(finalAmount);
				
				System.out.println("your amount is debited successfully");
				
				System.out.println("The current balance is:-"+finalAmount);
				
				LocalDate date = 	LocalDate.now();
				
				Random random = new Random();
				
				int transId= random.nextInt();
				
				Transaction transaction = new Transaction(accNo, "withdraw", date, withdrawlAmount, 0, finalAmount, transId);
				
				transactions.put(transId,transaction);
				
				break;
			}
			case 5: {
				System.out.println("********FUND TRANSFER********");
				
				System.out.println("Enter your account number:-");
				
				long accNoFrom = scan.nextLong();
				
				System.out.println("Enter your to account number:-");
				
				long accNoTo = scan.nextLong();
				
				System.out.println("Enter your amount to transfer:-");
				
				float transferAmount = scan.nextFloat();
				
				Account fromAccount = accounts.get( accNoFrom);
				
				Account toAccount = accounts.get(accNoTo);
				
				float fromAccountBalance = fromAccount.getAccBal();
				
				float toAccountBalance = toAccount.getAccBal();
				
				fromAccountBalance = fromAccountBalance - transferAmount ;
				
				toAccountBalance = toAccountBalance + transferAmount;
				
				fromAccount.setAccBal(fromAccountBalance);
				
				toAccount.setAccBal(toAccountBalance);
				
				System.out.println("Amount is transferred successfully");
				
				System.out.println("The current balance:-"+fromAccountBalance);
				
				LocalDate date = LocalDate.now();
				
				Random random = new Random();
				
				int transId = random.nextInt();
				
				Transaction transaction = new Transaction(accNoFrom,"fundTransfer", date, transferAmount, 0, fromAccountBalance, transId);
				
				transactions.put(transId,transaction);
				
				break;
			}
			case 6: {
				System.out.println("********BANK STATEMENT********");
				
				System.out.printf("%-15s%-15s%-15s%-15s%-15s","accNo", "typeOfTrans", "Date", "withdrawlAmount", "depositAmount",
						"balance"," transId");
				
				System.out.println();
				
				Set<Integer> set = transactions.keySet();
				
				Iterator itr = set.iterator();
				
				while(itr.hasNext()) {
					int key = (int) itr.next();
					
					Transaction trans = transactions.get(key);
					
					System.out.println(trans.getAccNo()+"   "+trans.getTypeOfTrans()+"   "+trans.getDate()+"   "+trans.getWithdrawlAmount()+"   "+trans.getDepositAmount()+"   "+
					trans.getBalance()+"   "+trans.getTransId());
					
					
					
				}
				
				value = false;
				
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


