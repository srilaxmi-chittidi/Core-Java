package com.java8.strings;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		String input = "[{}]";
		System.out.println(isValidParanthesis(input));
	}

	public static boolean isValidParanthesis(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : str.toCharArray()) {
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
