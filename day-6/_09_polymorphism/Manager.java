package com.bptn.course._09_polymorphism;

public class Manager extends Employee {
	
	private String access_level = "Manager";

	public Manager(String emp_id, String department_name) {
		super(emp_id, department_name);
	}

	@Override
	public void showProfile() {
		super.showProfile();
		System.out.print("\nAccess Level: "+access_level);
	}
	
}
