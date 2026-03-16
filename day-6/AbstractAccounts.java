package com.bptn.course._07_data_abstraction;

public class AbstractAccounts {
	
	public static void main(String args[]) {
		ChequingAccount myAccount = new ChequingAccount(12345, "John Doe", 1000.00);
		
		myAccount.withdraw(500.00);
		myAccount.deposit(500.00);
		myAccount.displayDetails();
	}
}
