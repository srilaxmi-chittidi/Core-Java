package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupCharsInStr {

	public static void main(String[] args) {
		String str = "ilovemyfamily";
		
		//findDupUsingMap(str);
		findDupUsingSet(str);
				
		
	}
	
	public static void findDupUsingMap(String str) {
		List<String> dupElements = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue()>1)
				.map(Map.Entry :: getKey)
				.collect(Collectors.toList());
					
		System.out.println(dupElements);
	}
	public static void findDupUsingSet(String str) {
		
		Arrays.stream(str.split("")).collect(Collectors.toSet()).forEach(System.out::print);
				
	}
	
}
