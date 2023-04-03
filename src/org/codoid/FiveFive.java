package org.codoid;

import java.util.LinkedHashMap;
import java.util.Collection;

public class FiveFive {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Mani", 25);
        map.put("Jeeva", 30);
        map.put("Maran", 35);
        
      
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }}
