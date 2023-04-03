package org.codoid;

import java.util.Vector;

	public class Enumeration {
	    public static void main(String[] args) {
	        Vector<String> colors = new Vector<String>();
	        colors.add("red");
	        colors.add("green");
	        colors.add("blue");
	        
	         java.util.Enumeration<String> e = colors.elements();
	        while (e.hasMoreElements()) {
	            String color = e.nextElement();
	            System.out.println(color);
	        }
	    }

}
