package com.interview.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareArrayListsFindAddElement {

	public static void main(String[] args) {
		List<String> list5 = new ArrayList<>(Arrays.asList("A","B","C","D"));
		List<String> list6 = new ArrayList<>(Arrays.asList("A","B","F","D"));
		System.out.println(list5.equals(list6));
		
		//find the additional element
		System.out.print("Additional element : ");
		list5.removeAll(list6);
		System.out.println(list5);
		
		//find the additional element in java8
		List<String> list9 = new ArrayList<>(Arrays.asList("A","B","C","D"));
		System.out.print("In Java8 :  Additional element : ");
		list9.stream()
			.filter(l->!list6.contains(l))
			.collect(Collectors.toList())
			.forEach(System.out::println);

		
		//find the common element
		List<String> list7 = new ArrayList<>(Arrays.asList("A","B","C","D"));
		System.out.print("Common element ");
		list7.retainAll(list6);
		System.out.println(list7);
		
		//find the common elements in java 8
		List<String> list8 = new ArrayList<>(Arrays.asList("A","B","C","D"));
		System.out.print("In Java 8 : Common element ");

		list8.stream()
				.filter(list6::contains)
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
