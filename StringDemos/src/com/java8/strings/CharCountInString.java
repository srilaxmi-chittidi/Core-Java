package com.java8.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountInString {

	public static void main(String[] args) {
		Map<String,Long> map = charCount("Hello How are you?");
		printMe(map);
	}
	public static Map<String, Long> charCount(String str){
		return Arrays.stream(str.split(""))
				     .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	public static void printMe(Map<String,Long> map) {
		map.forEach((key,value) -> System.out.println(key+" "+value));
	}
}
