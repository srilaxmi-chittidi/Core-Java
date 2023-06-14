package com.java8.strings;

public class StringRotation {

	public static void main(String[] args) {
		String input = "lakshmi";
		String target = "ilakshm";
		System.out.println(isRotatedStr(input,target));
	}

	public static boolean isRotatedStr(String input,String target) {
		String coInput = input.concat(input);
		return (input.length() == target.length() &&coInput.contains(target)) ? true : false;
	}
}
