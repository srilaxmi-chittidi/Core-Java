package com.basics.strings;

public class IsPalindromeOrNot {

	public static void main(String[] args) {
		System.out.println("Is this String palindrome "+isPalindrome("Aibohphobia"));
		System.out.println("Is this String palindrome "+isPalindrome("A man, a plan, a canal: Panama"));
		
	}
	public static boolean isPalindrome(String s) {
		
		String alphanumeric = s.replaceAll("[^a-zA-Z0-9]","");
		alphanumeric = alphanumeric.toLowerCase();
		int start =0; int end = alphanumeric.length()-1;
		while(start<end) {
			if(alphanumeric.charAt(start) != alphanumeric.charAt(end)) {
				return false;
			}
			start++; end--;
		}
		return true;
	}
}
