package com.practice.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("One", "1");
		map.put("Two", "2");
		map.put("Three", "3");
		map.put("Four", "4");
		map.put("Five", "5");
		// Print Map
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		Map<String,String> map1 = new HashMap<>();
		map1.put("Six", "6");
		map1.put("Two", "2");
		map1.put("Seven", "7");
		map1.put("Eight", "8");
		map1.put("Nine", "9");

		// compare two maps
		System.out.println(map.equals(map1));
		// compare those keysets
		System.out.println(map.keySet().equals(map1.keySet()));
		//Find extra keys
		
		Set<String> comSet = new HashSet<>(map.keySet());
		comSet.addAll(map1.keySet());
		comSet.removeAll(map.keySet());
		System.out.println(comSet);
		
		// Find extra keys using Java 8
		
		//TODO
			
		map.forEach((k,v)->map1.merg;
		//Combine 2 maps 
	}

}
