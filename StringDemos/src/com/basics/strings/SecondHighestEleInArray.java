package com.basics.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestEleInArray {

	public static void main(String[] args) {
		usingTreeMap(new int[] {6,2,1,7,11,7,23});
	}
	public static void usingTreeMap(int[] input) {
		
		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
//		for(int i=0;i<input.length;i++) {
//			map.put(input[i], map.getOrDefault(input[i], 0)+1);
//		}
		Arrays.stream(input)
				.boxed()
				.collect(
				Collectors.groupingBy(Function.identity()
				, TreeMap::new, Collectors.counting()))
				.forEach((k,v)->System.out.println(k+" "+v));
		System.out.println(map.size());
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		int second = map
		.entrySet()
		.stream()
		.skip(1)
		.findFirst()
		.get()
		.getValue();
		System.out.println("Second "+ second);
//		return 0;
	}
}
