package com.stream.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringsStreams {

	public static void main(String[] args) {
		//1. Second Highest Number
		secondHighestNum();
		
		//2. Longest String in Array
		longestString();
		
		//3. Numbers starts with "1"
		startsWith1();
		
		//4. Count of each character in String
		countCharsInStr();
		
		//5. Get Unique chars in String
		uniqueCharsInStr();
		
		//6. Print 2-8 numbers using skip && limit
		printNumbers();
		
		//7. Joining strings
		joinStrings();
	}
	public static void joinStrings() {
		System.out.println("-------------Joining strings---------------");
		String[] strArr = {"Hi","Hello","How","are","you"};
		String result = String.join("-",strArr);
		System.out.println(result);
	}
	
	public static void printNumbers() {
		System.out.println("-------------Print 2-8 numbers using skip && limit---------------");
		IntStream.rangeClosed(1, 10)
		         .skip(1)
		         .limit(7)
		         .forEach(System.out::println);
	}
	
	public static void uniqueCharsInStr() {
		System.out.println("-------------Get Unique chars in String---------------");
		String str ="Hi Hello How are you";
		Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x->x.getValue()==1)
				.collect(Collectors.toList())
				.forEach(System.out::println);;
	}
	public static void countCharsInStr() {
		System.out.println("-------------Count of each character in String---------------");
		String str ="Hi Hello How are you";
		Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()))
				.forEach((k,v)->System.out.println(k+" "+v));
	}
	public static void secondHighestNum() {
		System.out.println("--- Second Highest number ---------");
		int[] num = new int[] {5,9,11,2,8,21,1};
		int second = Arrays.stream(num)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(second);	
	}
	
	public static void longestString() {
		System.out.println("--- Longest String in Array -------");
		String[] strArr = {"Hi", "Hello" ,"world", "How"}; 
		String longest = Arrays.stream(strArr)
			  .reduce((word1, word2) -> (word1.length() > word2.length()
					  					?word1
					  					:word2))
			  .get();
		System.out.println(longest);
	}
	
	public static void startsWith1() {
		System.out.println("--- Numbers starts with \"1\"-------");

		int[] nums = new int[] {5,9,11,2,8,21,1};
		Arrays.stream(nums)
				.boxed()
				.map(x->x+"")
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
