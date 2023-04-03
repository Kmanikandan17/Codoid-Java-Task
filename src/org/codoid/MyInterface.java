package org.codoid;

public interface MyInterface {
	

	    void regularMethod();
	    
	    default void defaultMethod() {
	        System.out.println("This is a default method.");
	    }
	    
	    static void staticMethod() {
	        System.out.println("This is a static method.");
	    }
	}
 

