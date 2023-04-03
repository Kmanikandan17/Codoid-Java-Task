package org.codoid;

public class ExceptionHandling {

	  public static void main(String[] args) throws Exception {
	        divideNumbers(10, 0); 
	    }

	    public static int divideNumbers(int a, int b) throws Exception {
	        if (b == 0) {
	            throw new Exception("Cannot divide by zero"); 
	        }

	        return a / b;
	    }
}
