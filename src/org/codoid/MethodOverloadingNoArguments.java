package org.codoid;

public class MethodOverloadingNoArguments {
	 public void print() {
	        System.out.println("Printing with no arguments");
	    }

	    public void print(int num) {
	        System.out.println("Printing an integer: " + num);
	    }

	    public void print(int num1, int num2) {
	        System.out.println("Printing two integers: " + num1 + " and " + num2);
	    }

	    public static void main(String[] args) {
	        MethodOverloadingNoArguments obj = new  MethodOverloadingNoArguments();

	        obj.print();
	        obj.print(10); 
	        obj.print(5, 7); 
	    }
	}


