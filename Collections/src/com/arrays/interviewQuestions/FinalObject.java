package com.arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FinalObject {

	public static void main(String[] args) {
		final List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.remove(1);
		list.add(2, "D");
		
		//list = new LinkedList<>();
		list.stream().forEach(System.out::println);
	}

}
