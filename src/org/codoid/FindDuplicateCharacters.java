package org.codoid;

import java.util.HashMap;

public class FindDuplicateCharacters {
	 public static void main(String[] args) {
	        String str = "hello world";
	        HashMap<Character, Integer> charCountMap = new HashMap<>();
	        char[] charArray = str.toCharArray();
	        for (char c : charArray) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }
	        System.out.println("Duplicate characters in the string \"" + str + "\" are:");
	        for (char c : charCountMap.keySet()) {
	            if (charCountMap.get(c) > 1) {
	                System.out.println(c);
	            }
	        }
	    }

}
