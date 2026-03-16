package com.bptn.course._07_data_abstraction;

public abstract class Account {
	private int account_number;
	private String accout_holder_name;
	private double account_balance;
	
	public Account(int account_number, String account_holder_name, double account_balance) {
		this.account_number = account_number;
		this.accout_holder_name = account_holder_name;
		this.account_balance = account_balance;
	}
	
	public void displayDetails() {
		System.out.print("Account details:\nAccount Number"+account_number);
		System.out.print("\nAccount Balance"+account_balance);
	}
	
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
}
