package com.interview.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupsFromArrayList {

	public static void main(String[] args) {
		//Without using java8s
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,6,5,4,7,5,4,8));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(list3);
		ArrayList<Integer> la = new ArrayList<>(lhs);
		System.out.println(la);
		
		//Using java 8
		List<Integer> list4 = list3.stream().distinct().collect(Collectors.toList());
		System.out.println(list4);
	}

}
