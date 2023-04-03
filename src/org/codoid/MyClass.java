package org.codoid;

public class MyClass implements MyInterface {
	    @Override
	    public void regularMethod() {
	        System.out.println("This is a regular method.");
	    }
	    
	    public static void main(String[] args) {
	        MyClass myClass = new MyClass();
	        
	        myClass.regularMethod();
	        myClass.defaultMethod();
	        MyInterface.staticMethod();
	    }
	}


