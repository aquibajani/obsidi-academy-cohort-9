package com.bptn.course._10_inheritance.coding_1_29;

public class SavingsAccount extends Account {
	   

    //declare instance variable
    double interest_rate;

    //add parameterized constructor - use super keyword to call parent constructor
    public SavingsAccount(String name, double balance, double interest_rate) {
      super(name, balance);
      this.interest_rate = interest_rate;
    }

    //override the toString method
    @Override
    public String toString(){
      return super.toString() + "," + this.interest_rate;
    }

    // override the equals method
    // @Override
    public boolean equals(SavingsAccount obj) {
      return super.equals(obj) && this.interest_rate == obj.interest_rate;
    }

    
}
