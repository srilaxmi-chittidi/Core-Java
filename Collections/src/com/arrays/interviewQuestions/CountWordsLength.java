package com.arrays.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsLength {

	public static void main(String[] args) {
		String sent = "Hello Bujji How are you";
		char[] chars = sent.toCharArray();
		
		for(int i=0;i<chars.length-1;i++) {
			String s = "";
			while(i<chars.length && chars[i] != ' ') {
				s = s+chars[i];
				i++;
			}
			System.out.println(s+"-->"+s.length());
		}
		Map<String,List<String>> map = Arrays.stream(sent.split(" "))
			//  .map(x->x)
		      .collect(Collectors.groupingBy(Function.identity(),Collectors.reducing(String::length)));
		map.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
