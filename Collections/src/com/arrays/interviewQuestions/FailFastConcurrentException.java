package com.arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastConcurrentException {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add("D");
		}
	}

}
