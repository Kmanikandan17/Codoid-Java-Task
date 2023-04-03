package org.codoid;

public class ConstructorOverloading {
	
	public ConstructorOverloading() {
		System.out.println("default constructor");
	}
	public ConstructorOverloading (int age) {
		System.out.println("int parameterized constructor:"+age);
	}
	public ConstructorOverloading (String name) {
		System.out.println("String parameterized constrctor:"+name);
	}
	public static void main(String[]args) {
		ConstructorOverloading c=new ConstructorOverloading ();
		ConstructorOverloading c1=new ConstructorOverloading (17);
		ConstructorOverloading c2=new ConstructorOverloading ("CODOID");
	}
}
