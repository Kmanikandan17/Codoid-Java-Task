package org.codoid;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {
	
	    public static Set<Character> findDuplicates(String s) {
	        Set<Character> uniqueChars = new HashSet<>();
	        Set<Character> duplicates = new HashSet<>();

	        for (char c : s.toCharArray()) {
	            if (uniqueChars.contains(c)) {
	                duplicates.add(c);
	            } else {
	                uniqueChars.add(c);
	            }
	        }

	        return duplicates;
	    }

	    public static void main(String[] args) {
	        String inputString = "hello world";
	        Set<Character> duplicateChars = findDuplicates(inputString);
	        System.out.println(duplicateChars);
	    }
	}

