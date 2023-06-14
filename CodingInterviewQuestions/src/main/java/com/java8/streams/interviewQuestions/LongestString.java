package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {

		String[] strArry = {"java", "springboot", "C", "C++"};
		
		Optional<String> longest = Arrays.stream(strArry)
			.reduce((word1,word2)->(word1.length() >word2.length())? word1 :word2);
		
		System.out.println(longest);
	}

}
