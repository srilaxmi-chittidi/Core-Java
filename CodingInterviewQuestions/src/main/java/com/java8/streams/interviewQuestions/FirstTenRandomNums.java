package com.java8.streams.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class FirstTenRandomNums {

	public static void main(String[] args) {

		/*
		 * Stream.generate(Math :: random) .limit(10) .forEach(System.out::println);
		 */
		randomNums();
	}
	
	public static void randomNums() {
		Random random = new Random();

		random.ints().limit(10).forEach(System.out::println);
		
		List<Integer> emptyList =null ;
		List<Integer> list =  new ArrayList<>();
		/*Optional.ofNullable(emptyList)
				.orElse(list)
				.stream()
				.filter(Objects::nonNull)
				.map(note -> Integer::getInteger)
				.forEach(System.out::println);*/
	}

	
}
