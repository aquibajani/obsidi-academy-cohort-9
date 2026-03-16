package com.bptn.course._09_polymorphism;

public class OverridingExample{
	public static void main(String args[]) {
		Manager m1 = new Manager("12345","Marketing");
		m1.showProfile();
		
		System.out.println();
		
		Engineer e1 = new Engineer("56789", "IT");
		e1.showProfile();
	}
}
