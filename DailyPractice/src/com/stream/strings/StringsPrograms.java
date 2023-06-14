package com.stream.strings;

import java.util.Arrays;
import java.util.BitSet;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringsPrograms {

	public static void main(String[] args) {
		//System.out.println(reverseString());
		//indexOfStr();
		//printUpto100NumsWithoutUsingLoop();
		printDescOrderOfItsFreq();
	}
	public static String reverseString() {
		String str ="Hello";
		char[] charArray = str.toCharArray();
	    int length = str.length();
	    return IntStream.range(0, length)
	      .mapToObj(i -> charArray[length - i - 1])
	      .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	      .toString();
	}
	
	public static void indexOfStr() {
		String str ="Hi Hello How are you";
		System.out.println(str.indexOf('H', str.indexOf('H')+1));
		int one = 'A'/'A';
		int hundred = 'd';
		for(int i = one;i<=hundred;i++) {
			System.out.println(i);
		}
	}
	
	public static void printUpto100NumsWithoutUsingLoop() {
		Object[] numbers = new Object[100];
		Arrays.fill(numbers, new Object() {
			int count =1;
			
			public String toString() {
				return Integer.toString(count++);
			}
		});
		System.out.println(Arrays.toString(numbers));
		
		// Using BitSet
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set,1,set.length());
	}
	
	public static void printDescOrderOfItsFreq() {
		String str ="banana";
		
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity()
				,TreeMap::new
				,Collectors.counting()))
				.forEach((k,v)->System.out.println(k+" "+v));;
	}
}
