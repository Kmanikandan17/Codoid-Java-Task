package org.codoid;

import java.util.Scanner;

public class PalindromeChecker {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the Value:");
			  String s=sc.next();
			  
			  String s1="";
			  for(int i=s.length()-1;i>=0;i--) {
				  char ca = s.charAt(i);
				  s1=s1+ca;
			  }
			  System.out.println("The given value:"+s);
			  System.out.println("The Reverse Value:"+s1);
			  
			  if(s.equals(s1)) {
			  System.out.println("it is a palindrom");
			  }
			  else {
				  System.out.println("it is not palindrom");
			  }
			}

	}
	     