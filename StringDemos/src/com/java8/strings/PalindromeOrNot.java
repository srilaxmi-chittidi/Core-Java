package com.java8.strings;

import java.util.stream.IntStream;

public class PalindromeOrNot {

	public static void main(String[] args) {
		System.out.println("Is Palindrome ? "+isPalindrome("malaylam")); //Positive Scenario
		System.out.println("Is Palindrome ? "+isPalindrome("hello"));    //Negative Scenario
	}
	public static boolean isPalindrome(String str){  
		int bp = str.length()-1;  
		return IntStream 
					.range(0, str.length()) 
					.allMatch(position-> 
						str.charAt(position) == str.charAt(bp-position));  
		}  
}
