package org.codoid;
import java.util.PriorityQueue;
public class PriorityQeueExample {
	
	    public static void main(String[] args) {
	       
	     PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        
	        pq.add(5);
	        pq.add(1);
	        pq.add(10);
	        pq.add(3);
	        
	        System.out.println(pq);
	        
	        pq.remove();
	        System.out.println(pq);
	        
	       
	        System.out.println("Head element: " + pq.peek());
	        
	       
	        if (pq.contains(10)) {
	            System.out.println("Priority queue contains 10");
	        } else {
	            System.out.println("Priority queue does not contain 10");
	        }
	        
	       
	        System.out.println("Priority queue size: " + pq.size());
	    }
}
