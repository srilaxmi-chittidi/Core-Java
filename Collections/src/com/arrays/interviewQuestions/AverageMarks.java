package com.arrays.interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AverageMarks {

	public static void main(String[] args) {
		String[] input = {"1-english:45" , "2-english:55", "3-hindi:60","4-hindi:60","5-maths:70"};
		String[] str = Arrays.stream(input)
		.map(x->x.split("-"))
		.toList()
		.get(1);
		
		for(String s: str) {
			System.out.println(s+" ");
		}
//		
//		.collect(Collectors.toMap(
//				x->x[0].substring(2,x[0].length()), 
//				Integer.MIN_VALUE));
//		
//		Arrays.
}
}