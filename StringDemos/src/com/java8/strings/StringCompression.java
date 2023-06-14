package com.java8.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {

	public static void main(String args[]) {
		String str = "aabcccccaaa";
		System.out.println(getStringCom(str));
				
	}
	
	public static String getStringCom(String str) {
		
	//	Map<String,Long> map = 
				Arrays.asList(str.split("")).stream().collect(
				Collectors.groupingBy(
				Function.identity(),Collectors.counting()))
				.entrySet().stream().forEach(null);
				;
	//	map.forEach((k,v) ->System.out.println(k+" "+v));
		return null;
	}
}
