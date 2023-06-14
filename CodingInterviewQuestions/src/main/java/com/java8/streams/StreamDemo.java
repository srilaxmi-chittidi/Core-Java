package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12,3,5,8,1,45,23);
		
		Predicate<Integer> p = (t) -> t>6;
		list.stream().filter(p).sorted().forEach(System.out::println);
	}

}
