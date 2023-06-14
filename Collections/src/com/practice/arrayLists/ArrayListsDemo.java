package com.practice.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//list.stream().forEach(System.out::println);
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom","Ram","Sita","Tom"));
		names.retainAll(Collections.singleton("Tom"));
		System.out.println(names);
		
		}

}
