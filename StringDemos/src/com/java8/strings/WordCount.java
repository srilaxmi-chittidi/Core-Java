package com.java8.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		String str ="Hi Hello How are you?";
		System.out.println(wordCount(str));
		wordCount8();
		wordCount7();
	}
	
	public static long wordCount(String str) {
		return Arrays.stream(str.split(" "))
			      .collect(Collectors.counting());
	}
	
	public static void wordCount8() {
		String sentence = "Hello Hi, hlshkd. kjdf% How are you?";
		
		Arrays.stream
				(sentence.split("[^a-zA-Z0-9]+"))
				.parallel()
				.forEach(System.out::println);
	}
	
	public static void wordCount7() {
		String sentence = "Hello Hi, hlshkd. kjdf% How are you?";
		// TODO
	}
}
