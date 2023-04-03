package org.codoid;

public class Factorial {

	 public static void main(String[] args) {
	        int num = 5; 
	        int result = factorial(num);
	        System.out.println(num + "! = " + result);
	    }
	    
	    public static int factorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
}
