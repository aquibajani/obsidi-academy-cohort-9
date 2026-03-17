package com.bptn.course._10_inheritance.coding_1_28_part_1;

public class Car extends Vehicle {

	   //instance variable 
	   String steeringWheel;

	   //add parameterized constructor- use super keyword to call parent constructor
	   Car(String colour, String brand, String steeringWheel){
	    super(colour, brand);
	    this.steeringWheel = steeringWheel;
	   }

	}