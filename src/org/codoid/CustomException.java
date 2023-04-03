package org.codoid;


public class CustomException {
	
	 public static void main(String[] args) {
	        try {
	            int result = divideNumbers(10, 0);
	            System.out.println("Result: " + result);
	        } catch (DivideByZeroException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static int divideNumbers(int numerator, int denominator) throws DivideByZeroException {
	        if (denominator == 0) {
	            throw new DivideByZeroException("Cannot divide by zero");
	        }
	        return numerator / denominator;
	    }

	    public static class DivideByZeroException extends Exception {

	        public DivideByZeroException(String message) {
	            super(message);
	        }
	    }
	}
	
	
