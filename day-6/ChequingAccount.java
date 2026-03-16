package com.bptn.course._07_data_abstraction;

public class ChequingAccount extends Account {
	private final float INTEREST_RATE = (float) 0.01;
	
	public ChequingAccount(int account_number, String account_holder_name, double account_balance) {
		super(account_number, account_holder_name, account_balance);
	}
	
	@Override
	public void withdraw(double amount) {
		// modify the account balance
		// return the new balance
		System.out.print("\nWithdraw successsful!");
	}
	
	@Override
	public void deposit(double amount) {
		// modify the account balance
		// return the new balance
		System.out.print("\nDeposit successsful!");
	}

	
}
