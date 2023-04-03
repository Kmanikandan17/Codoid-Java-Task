package org.codoid;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapSortByValue {
	
	  public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("Mani", 25);
	        map.put("Anbu", 30);
	        map.put("Durai", 20);
	        map.put("Babu", 35);

	        
	        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });

	        
	        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	       
	        System.out.println("Sorted HashMap by Value:");
	        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
