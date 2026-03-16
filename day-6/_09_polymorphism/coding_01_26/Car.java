package com.bptn.course._09_polymorphism.coding_01_26;

public class Car extends Vehicle {
	   
    //Step 2a: Declare String steeringWheel 
    String steeringWheel;

    //Step 2b: Define a parameterized constructor as per the specifications above
    public Car(String color, String brand, String steeringWheel){
      super(color, brand);
      this.steeringWheel = steeringWheel;
    }

    //Step 2c: Create a print() method as per the specifications above
    @Override
    public void print() { 
      super.print(); 
    }
}