package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepNonRepFirstChar {

	public static void main(String[] args) {

		String str = "ilovemyfamily";
		findFirstRepeatedChar(str);
		findFirstNonRepeatedChar(str);
	}

	public static void findFirstRepeatedChar(String str) {
		Map<Character, Long> map = str.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,
		        Collectors.counting()));
		Character ch = map.entrySet()
				.stream()
				.filter(x -> x.getValue()>1)
				.findFirst()
				.get()
				.getKey();
		System.out.println(ch);
	}
	
	public static void findFirstNonRepeatedChar(String str) {
		Map<Character, Long> map = str.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		Optional<Character> ch = map.entrySet()
				.stream()
				.filter(x -> x.getValue()==1)
				.map(x->x.getKey())
				.findFirst();
		System.out.println(ch.isPresent() ? ch.get() : null);
	}
}// @formatter:off
 
// @formatter:on

