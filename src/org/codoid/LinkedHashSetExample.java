package org.codoid;
	import java.util.LinkedHashSet;
	import java.util.Set;

	public class LinkedHashSetExample {
	    public static void main(String[] args) {
	        Set<String> set = new LinkedHashSet<String>();
	        
	       
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Banana");
	        set.add("Orange");
	        
	        
	        System.out.println(set);
	        
	        
	        set.remove("Banana");
	        System.out.println(set);
	        
	        
	        if (set.contains("Apple")) {
	            System.out.println("Set contains Apple");
	        } else {
	            System.out.println("Set does not contain Apple");
	        }
	        
	        
	        System.out.println("Set size: " + set.size());
	    }
}
