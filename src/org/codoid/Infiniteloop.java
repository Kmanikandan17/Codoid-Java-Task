package org.codoid;

public class Infiniteloop {
	
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			for(i=1;i<=5;i++) {
				System.out.println("CODOID");
			}
		}
	}

}
