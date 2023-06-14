package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] numbers = {7, 4, 5, 54, 36, 10 };
		int value = Arrays.stream(numbers).boxed()
		.sorted(Comparator.reverseOrder() )
		.skip(1)
		.findAny()
		.get();
		
		System.out.println(value);
	}

}
