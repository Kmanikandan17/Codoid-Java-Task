package org.codoid;

import java.util.HashMap;

public class MapValuesIteration {
	  public static void main(String[] args) {
	       HashMap<String, Integer> map = new HashMap<>();
	        map.put("Mani", 30);
	        map.put("Anbu", 25);
	        map.put("Raja", 40);

	        map.values().forEach(value -> System.out.println(value));
	    }
}
