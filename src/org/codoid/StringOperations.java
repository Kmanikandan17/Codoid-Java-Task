package org.codoid;

public class StringOperations {
	 public static void main(String[] args) {
	        String str1 = "HI ";
	        String str2 = "CODOID";

	        
	        int len = str1.length();
	        System.out.println("Length of str1 is " + len);

	       
	        String str3 = str1.concat(str2);
	        System.out.println("Concatenated string is " + str3);

	        String str4 = str3.replace("CODOID", "HI");
	        System.out.println("Replaced string is " + str4);
	    }
}
