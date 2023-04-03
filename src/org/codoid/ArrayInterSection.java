package org.codoid;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInterSection {

	public static void main(String[] args) {
       
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

       
        ArrayList<Integer> commonElements = new ArrayList<Integer>();

       
        for (int i = 0; i < arr1.length; i++) {
           
            for (int j = 0; j < arr2.length; j++) {
               
                if (arr1[i] == arr2[j]) {
                    commonElements.add(arr1[i]);
                }
            }
        }

        
        Integer[] result = commonElements.toArray(new Integer[commonElements.size()]);

        
        System.out.println("Common elements: " + Arrays.toString(result));
    }
}
