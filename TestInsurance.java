package com.example.tests;

public class TestInsurance {

	public static void main(String[] args) {

		Policy myPolicy = new Policy(1234, 1000000.0, true, 14);
		myPolicy.payPremium(1000);
		myPolicy.getBalance();
}
}