package org.codoid;

import java.util.Collection;
import java.util.LinkedHashMap;

public class LinkedHaspMap {
	  public static void main(String[] args) {
	       
	        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
	        map.put("Mani", 25);
	        map.put("jaffar", 30);
	        map.put("Anbu", 35);

	       
	        Collection<Integer> values = map.values();
	        for (Integer value : values) {
	            System.out.println(value);
	        }
	    }

}
