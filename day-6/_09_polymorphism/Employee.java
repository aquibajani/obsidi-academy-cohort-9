package com.bptn.course._09_polymorphism;

public abstract class Employee {
	private String emp_id;
	private String department_name;
	
	public Employee(String emp_id, String department_name) {
		this.emp_id = emp_id;
		this.department_name = department_name;
	}
	
	public void showProfile() {
		System.out.print("Employee ID : "+emp_id);
		System.out.print("\nDepartment Name : "+department_name);
	};
}