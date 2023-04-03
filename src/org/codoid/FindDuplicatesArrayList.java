package org.codoid;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicatesArrayList {

	 public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(2);
	        list.add(4);
	        list.add(1);
	        
	        HashSet<Integer> duplicates = new HashSet<Integer>();
	        
	        for (int i = 0; i < list.size(); i++) {
	            for (int j = i + 1; j < list.size(); j++) {
	                if (list.get(i).equals(list.get(j))) {
	                    duplicates.add(list.get(i));
	                    break;
	                }
	            }
	        }
	        
	        System.out.println("Duplicates: " + duplicates);
	    }
}
