package org.codoid;

public class BreakAndContinue {

	 public static void main(String[] args) {
	        int i = 1;
	        
	        while (i <= 10) {
	            if (i == 5) {
	                System.out.println("Skipping 5...");
	                i++;
	                continue;
	            }
	            if (i == 8) {
	                System.out.println("Breaking at 8...");
	                break;
	            }
	            System.out.println(i);
	            i++;
	        }
	    }
}
