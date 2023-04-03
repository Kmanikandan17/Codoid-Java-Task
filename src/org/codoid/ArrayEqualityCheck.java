package org.codoid;

import java.util.Arrays;

public class ArrayEqualityCheck {
	
	 public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {5, 2, 3, 4, 1};

	        
	        Arrays.sort(array1);
	        Arrays.sort(array2);

	        
	        boolean arraysEqual = Arrays.equals(array1, array2);
	        if (arraysEqual) {
	            System.out.println("Arrays contain the same elements");
	        } else {
	            System.out.println("Arrays do not contain the same elements");
	        }
	    }

}
