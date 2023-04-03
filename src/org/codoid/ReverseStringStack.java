package org.codoid;

import java.util.Stack;

public class ReverseStringStack {

	public static void main(String[] args) {
        String str = "CODOID!";
        
        Stack<Character> stack = new Stack<Character>();
        
       
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed.toString());
    }
}
