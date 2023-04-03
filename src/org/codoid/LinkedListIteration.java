package org.codoid;

import java.util.LinkedList;

public class LinkedListIteration {
	
	 public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");

	       
	        list.forEach(item -> System.out.println(item));
	    }

}
