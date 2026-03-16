package com.bptn.course._09_polymorphism.coding_01_25;

public class Add {

	    // Create your code here:
	    public int add(int num1, int num2){
	      return num1+num2;
	    }

	    public int add(int num1, int num2, int num3){
	      return num1+num2+num3;
	    }

	    public double add(double num1, double num2){
	      return num1+num2;
	    }

	    // Do not modify the code below. The code below gives you the idea of how the different methods are called.
	    public static void main(String args[]) {
	        Add obj = new Add();
	        System.out.println(obj.add(12, 21));
	        System.out.println(obj.add(11, 23, 10));
	        System.out.println(obj.add(100.10, 200.5));
	    }
	

}
