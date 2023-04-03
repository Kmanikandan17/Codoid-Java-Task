package org.codoid;

public class MethodOverloading {
	  public void print(int num) {
	        System.out.println("Printing an integer: " + num);
	    }

	    public void print(double num) {
	        System.out.println("Printing a double: " + num);
	    }

	    public void print(String str) {
	        System.out.println("Printing a string: " + str);
	    }

	    public static void main(String[] args) {
	        MethodOverloading obj = new MethodOverloading();

	        obj.print(10); 
	        obj.print(3.14); 
	        obj.print("Hello"); 
	    }
	}


