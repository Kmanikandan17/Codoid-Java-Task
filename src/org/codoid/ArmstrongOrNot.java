package org.codoid;

import java.util.Scanner;

public class ArmstrongOrNot {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = input.nextInt();

	        int sum = 0;
	        int temp = num;
	        int digits = String.valueOf(num).length();

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digits);
	            temp /= 10;
	        }

	        if (num == sum) {
	            System.out.println(num + " is an Armstrong number.");
	        } else {
	            System.out.println(num + " is not an Armstrong number.");
	        }
	    }

}
