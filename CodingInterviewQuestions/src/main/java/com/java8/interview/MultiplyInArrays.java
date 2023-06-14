package com.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyInArrays {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,5,23,9);
		
		Optional<Integer> output = list.stream().reduce((x,y) -> x*y);
		
		output.ifPresentOrElse(System.out::println, null);
	}

}
