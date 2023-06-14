package com.java8.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramOrNot {

	public static void main(String[] args) {
		System.out.println(isAnagram("Listen","Silent")); //Positive Scenario
		System.out.println(isAnagram("Ram","Sita"));      // Negative Scenario
	}
	public static boolean isAnagram(String first,String second) {
		return Stream.of(first.toLowerCase().split(""))
					 .sorted()
					 .collect(Collectors.joining())
					 .equals(Stream.of(second.toLowerCase().split(""))
					  			   .sorted()
					  			   .collect(Collectors.joining()));
	}
}
