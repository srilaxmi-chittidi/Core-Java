package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

			int[] intArray = new int[] {2,4,5,2,6,5};
			 
			 List<Integer> intList = Arrays.asList(2,4,5,2,6,5);
			 List<Integer> uniqueList = intList.stream()
			 		.distinct()
			 		.collect(Collectors.toList());
			 String str = Arrays.toString(intArray);
			 Arrays.stream(str.split(""))
			 		.collect(Collectors.toSet())
			 		.forEach(System.out::println);
			 System.out.println(uniqueList);
			}
}
