package com.java8.streams.interviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatChar {

	public static void main(String[] args) {
		String str = "ilovemyfamily";
		
		
		String NonRepeatEle = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue()==1)
				.findFirst()
				.get()
				.getKey();
		System.out.println("The First Non repeated element :"+NonRepeatEle);
	}

}
