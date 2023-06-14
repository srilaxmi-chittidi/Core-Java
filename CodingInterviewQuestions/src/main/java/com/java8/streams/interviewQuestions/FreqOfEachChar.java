package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachChar {

	public static void main(String[] args) {
		
		String str = "Hi Hello How are you?";
		
		char[] charArr = str.toCharArray();
		
		//Map<String,Long> map = 
		Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k,v) -> System.out.println(k+" "+v));;
		
//		for(Map.Entry<String, Long> entry : map.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
	}

}
