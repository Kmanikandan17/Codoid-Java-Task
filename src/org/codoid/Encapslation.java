package org.codoid;

public class Encapslation {
	
	    private String name;
	    private int age;
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    
	    public void setAge(int age) {
	        this.age = age;
	    }
	

	
	    public static void main(String[] args) {
	        Encapslation person = new Encapslation ();
	        person.setName("Anbu");
	        person.setAge(25);
	        
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
}
