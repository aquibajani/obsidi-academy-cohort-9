package com.bptn.course._10_inheritance.coding_1_28_part_2;
public class Vehicle {

    // add parameterized constructor
    String colour, brand;

    Vehicle() {
       this("Black", "Tesla");
   }
   
   Vehicle(String colour, String brand){
    this.colour = colour;
    this.brand = brand;
   }

    public void print() {
        System.out.println(this.colour + " " + this.brand);
    }
    
    public static void main(String[] args) {
       Car car = new Car("White", "Audi", "Chromecoloured");
       Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
       car.print();
       bike.print();

   }

}


