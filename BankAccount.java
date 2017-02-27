package com.example.tests;

	public class BankAccount {
		private int AccountNumber;
		private String name;
		private double Balance;
		private boolean isActive;
		
	
		
		public BankAccount(int AccountNumber, boolean isActive, double Balance){
			this.AccountNumber = AccountNumber;
			this.Balance = Balance;
			this.isActive = isActive;
		}
		
		public void Withdraw(double amount)
		{
			Balance = Balance - amount;
		}
		
		public void Deposit(double amount)
		{
			Balance = Balance + amount;
		}
		
		public void getBalance()
		{
			System.out.println("Balance is " + Balance);
		}
	}