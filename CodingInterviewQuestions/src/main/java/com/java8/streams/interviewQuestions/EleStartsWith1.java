package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EleStartsWith1 {

	public static void main(String[] args) {

		int[] intArry = {1, 23, 123, 45, 145};
		
		List<String> values = Arrays.stream(intArry).boxed()
			.map(s -> s+"")
			.filter(s -> s.startsWith("1"))
			.collect(Collectors.toList());
		
		System.out.println(values);
		
	}

}
