package org.codoid;

import java.util.HashMap;

public class DuplicateStringElement {

	  public static void main(String[] args) {
	        String str = "Hello World";
	        char[] chars = str.toCharArray();

	        
	       HashMap<Character, Integer> charCountMap = new HashMap<>();

	        
	        for (char c : chars) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }

	        
	        System.out.print("Duplicate characters in the string " + str + ": ");
	        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	    }
}
