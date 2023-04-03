package org.codoid;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElement {
	
	    public static void main(String[] args) {
	        Integer[] arr = {1, 2, 2, 3, 4, 4, 5};
	        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
	        Integer[] result = set.toArray(new Integer[set.size()]);
	        System.out.println("Original array: " + Arrays.toString(arr));
	        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
	    }

}
