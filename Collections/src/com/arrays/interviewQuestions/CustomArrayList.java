package com.arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList {

	public static void main(String[] args) {

		List ca = new CustomArrayList();
		ca.add("A");
		ca.add("A");
		ca.add("B");
		ca.add("C");
		ca.stream().forEach(System.out::println);
	}

	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add((String) o);
		}
	}
}
