package com.java8.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseStr("Hi Hello How are you?"));
	}
	public static String reverseStr(String str) {
		return Arrays.stream(str.split(" "))
			  .map((val)->new StringBuilder(val).reverse())
			  .collect(Collectors.joining(" "));
	}
}
