package org.codoid;

 class Animal {
	    public void makeSound() {
	        System.out.println("The animal makes a sound");
	    }
	}

 class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("The cat meows");
	    }
	}

 class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("The dog barks");
	    }
	}

	public class MethOverriding {
	    public static void main(String[] args) {
	        Animal animal = new Animal();
	        animal.makeSound(); 

	        Cat cat = new Cat();
	        cat.makeSound();
	        
	        Dog dog = new Dog();
	        dog.makeSound(); 
	    }
	}


