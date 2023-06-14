package com.java8.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueCharsInString {

	public static void main(String[] args) {
		System.out.println("All chars are unique : "+isAllUniqueCharsInStr("Jav"));
		System.out.println("All chars are unique : "+isAllUniqueCharsInStr("Java"));
		System.out.println("Unique charaters : "+findUniqueCharsInString("Java"));
		System.out.println("First NonRepeatable Char in String  "+findFirstNonRepeatCharInString("SpringBoot"));
		System.out.println("Second Highest Number in Array "+findSecondHighestNumInArray(new int[] {6,2,1,7,11,7,23}));
		System.out.println("Largest String in given array "+longestStringInArray(new String[] {"Hi","Hello","How","are","you?"}));
		System.out.println("Number starts with 1"+startWithOne(new int[] {2,4,12,56,14,78}));
		IntStream.rangeClosed(1, 5).forEach(System.out::println);
	}
	public static boolean isAllUniqueCharsInStr(String str) {
		return Arrays.stream(str.split(""))
					 .collect(Collectors.groupingBy(
							 			Function.identity()
							 			,Collectors.counting()))
					 .entrySet()
					 .stream()
					 .filter(x->x.getValue()>1)
					 .findAny()
					 .isEmpty();
	}
	public static List<String> findUniqueCharsInString(String str){
		return Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x->x.getValue()==1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}
	public static String findFirstNonRepeatCharInString(String str) {
		return Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap :: new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x->x.getValue() == 1)
				.findFirst()
				.get()
				.getKey();
	}
	public static int findSecondHighestNumInArray(int[] input) {
		return Arrays.stream(input)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
	}
	public static String longestStringInArray(String[] words) {
		return Arrays.stream(words)
				.reduce((word1, word2)->word1.length()>word2.length()?word1:word2)
				.get();
	}
	public static List<String> startWithOne(int[] numbers){
		
		return Arrays.stream(numbers)
				.boxed()
				.map(x->x+"")
				.filter(x->x.startsWith("1"))
				.collect(Collectors.toList());
	}
}
