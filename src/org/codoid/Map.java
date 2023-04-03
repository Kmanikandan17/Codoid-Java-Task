package org.codoid;

import java.util.HashMap;

public class Map {

	 public static void main(String[] args) {
	      HashMap<Integer, String> map = new HashMap<>();
	        map.put(1, "one");
	        map.put(2, "two");
	        map.put(3, "three");

	       
	        map.values().forEach(value -> System.out.println(value));
	    }
}
