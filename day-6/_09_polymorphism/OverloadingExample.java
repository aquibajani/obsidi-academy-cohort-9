package com.bptn.course._09_polymorphism;

class MakePayment {
	private String user_email;
	private String user_password;
	private String user_phone;
	private short otp;
	
	// Constructor
	public MakePayment(String user_email) {
		this.user_email = user_email;
	}
	
	public MakePayment(String user_phone, short otp) {
		this.user_phone = user_phone;
		this.otp = otp;
	}
	
	public MakePayment(String user_email, String user_password) {
		this.user_email = user_email;
		this.user_password = user_password;
	}
	
	
	// Method Overloading
	public void pay(String user_email) {
		System.out.println("Logging in with email only!");
	}
	
	public void pay(String user_phone, short otp) {
		System.out.println("Logging in with phone and otp!");
	}
	
	public void pay(String user_email, String user_password) {
		System.out.println("Logging in with email and password!");
	}
}



public class OverloadingExample {
	
	public static void main(String args[]) {
		MakePayment attempt1 = new MakePayment("test@test.com");
		attempt1.pay("test@test.com");
		
		MakePayment attempt2 = new MakePayment("255252526", (short) 123);
		attempt2.pay("255252526", (short) 123);
		
		MakePayment attempt3 = new MakePayment("test@test.com", "test123");
		attempt3.pay("test@test.com", "test123");
		
	}
	
}
