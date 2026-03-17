package com.bptn.course._10_inheritance.coding_1_28_part_2;

public class Car extends Vehicle {
	   String steeringWheel;

	   Car(String colour, String brand, String steeringWheel){
	    super(colour, brand);
	    this.steeringWheel = steeringWheel;
	   }

	   // Fill in the code
	   public void print() {
	      super.print();
	    }

	}