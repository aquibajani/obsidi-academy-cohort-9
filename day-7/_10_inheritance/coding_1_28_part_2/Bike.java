package com.bptn.course._10_inheritance.coding_1_28_part_2;

public class Bike extends Vehicle {
	   String bikeHandle;

	   public Bike(String colour, String brand, String bikeHandle) {
	       this.colour = colour;
	       this.brand = brand;
	       this.bikeHandle = bikeHandle;
	   }

	    public void print() {
	      super.print();
	    }

	}
