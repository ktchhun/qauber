package com.example.tests;

public class Accounts {

	public static void main(String[] args) {

			BankAccount1 account1 = new BankAccount1(1, "account1", 100.0, true);
			BankAccount1 account2 = new BankAccount1(2, "account2", 200.0, true);
			BankAccount1 account3 = new BankAccount1(3, "account3", 300.0, true);
			BankAccount1 account4 = new BankAccount1(4, "account4", 400.0, true);
			BankAccount1 account5 = new BankAccount1(5, "account5", 500.0, true);
			BankAccount1 account6 = new BankAccount1(6, "account6", 600.0, true);
			BankAccount1 account7 = new BankAccount1(7, "account7", 700.0, true);
			BankAccount1 account8 = new BankAccount1(8, "account8", 800.0, true);
			BankAccount1 account9 = new BankAccount1(9, "account9", 900.0, true);
			BankAccount1 account10 = new BankAccount1(10, "account10", 1000.0, true);
			BankAccount1 account11 = new BankAccount1(11, "account10", 10000.0, true);			
			
			BankAccount1[] accounts = {account1, account2, account3, account4, 
						   account5, account6, account7, account8, account9, account10};
			
			for (int i=0; i < accounts.length; i++){
				System.out.println(accounts[i].getBalance());
			}
			
//			Withdrawing from account11 using for loop		
			
			for (; account11.getBalance() > 500; ){
				account11.withdrw(500);
			}

	}

}
