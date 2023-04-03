package org.codoid;

public class StarPattern {
	
	 public static void main(String[] args) {
	        int n = 6;
	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            if (i == 2) {
	                i++;
	            }
	        }
	    }

}
