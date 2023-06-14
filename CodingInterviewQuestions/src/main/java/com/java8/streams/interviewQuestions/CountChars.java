package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountChars {

	public static void main(String[] args) {
		
		String input = "Basants";
		
		Map<String,Long> countMap = Arrays.stream(input.split(""))
				.collect(
						Collectors.groupingBy(
								Function.identity() , Collectors.counting() //counting()
								)
				);
		
		String str = "i am i am";
		
		Map<String,Long> count =Arrays.stream(str.split(" ")).collect(
				Collectors.groupingBy(
						Function.identity() , Collectors.counting() //counting()
						)
				);
		System.out.println(count);
	}

}
