package com.java8.LocalDate;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountOfChars {

	public static void main(String[] args) {
		String str = "Hi, HeLlo how are you?";
		Predicate<String> p = x -> (x == null || x.isBlank());
		//string st =Optional.of(p.test(str));//.orElseThrow(new Exception());
		
		String alterStr = str.replaceAll("[^a-zA-Z0-9]", "");
		Map<String,Long> map = Arrays.asList(alterStr.split(""))
				.stream()
				.collect(Collectors.groupingBy(x->x.toLowerCase(),LinkedHashMap::new, Collectors.counting()));
				//.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
