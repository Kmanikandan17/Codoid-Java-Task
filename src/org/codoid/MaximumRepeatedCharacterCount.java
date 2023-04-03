package org.codoid;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumRepeatedCharacterCount {
	public static void main(String[] args) {
        String str = "Hello World";
        char[] chars = str.toCharArray();

        
       HashMap<Character, Integer> charCountMap = new HashMap<>();

        
        for (char c : chars) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        
        int maxCount = 0;
        for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
            }
        }

        
        System.out.println("Maximum repeated character count in the string " + str + ": " + maxCount);
    }
}
