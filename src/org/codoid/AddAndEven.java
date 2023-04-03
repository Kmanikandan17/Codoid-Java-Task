package org.codoid;

public class AddAndEven {
public static void main(String[] args) {
		
		int count=0;
		int sum=0;
		
		for (int i = 0; i < 5; i++) {
			if(i%2!=1) {
				
			count =count+1;
			sum=sum+i;
	
			}
			
		}
	
		System.out.println("No.of add value:"+count);
		System.out.println("sum of add value:"+sum);
		
	}


}
