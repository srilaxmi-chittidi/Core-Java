package com.leetcode.easy;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		String s = "((((";
		System.out.println(validParams(s));
	}

	public static boolean validParams(String s) {
		if(s.length() %2 !=0)
			return false;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) =='{') {
				stack.push(s.charAt(i));
			}
			if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
}
/**
Valid Parentheses
Given a string s containing just the characters '(' , ')' , '{' , '}' ,
'[' & ']' , determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Every close bracket has a corresponding open bracket of the same type.
 */