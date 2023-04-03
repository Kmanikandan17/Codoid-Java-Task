package org.codoid;

import java.util.Scanner;

public class MultiplicationTable {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = input.nextInt();

	        System.out.println("Multiplication table of " + num + ":");

	        for (int i = 1; i <= 10; i++) {
	            int product = num * i;
	            System.out.println(num + " x " + i + " = " + product);
	        }
	    }
}


