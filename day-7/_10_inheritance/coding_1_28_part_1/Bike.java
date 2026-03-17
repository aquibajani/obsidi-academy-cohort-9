package com.bptn.course._10_inheritance.coding_1_28_part_1;

public class Bike extends Vehicle {

	   //Declare an instance variable- String bikeHandle
	   String bikeHandle;

	   //add parameterized constructor- use super keyword to call parent constructor
	    Bike(String colour, String brand, String bikeHandle){
	      super(colour, brand);
	      this.bikeHandle = bikeHandle;
	    }
	}
