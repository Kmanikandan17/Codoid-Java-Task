package org.codoid;

import java.util.HashMap;
import java.util.Map.Entry;



public class HaspMapIteration {

	  public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("Mani", 25);
	        map.put("Bava", 30);
	        map.put("Chandru", 35);
	        map.put("Durai", 40);

	       
	        System.out.println("Iterating HashMap using while loop:");
	        HashMap.Entry<String, Integer> entry;
	        java.util.Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
	        while (iterator.hasNext()) {
	            entry = iterator.next();
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	        }
	        
        System.out.println("-------------------------------------------------------------------");
	        
	      
	        System.out.println("Iterating HashMap using enhanced for loop:");
	        for (HashMap.Entry<String, Integer> entry1 : map.entrySet()) {
	            System.out.println("Key = " + entry1.getKey() + ", Value = " + entry1.getValue());
	        }
	    }
}
