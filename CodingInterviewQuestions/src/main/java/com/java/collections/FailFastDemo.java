package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add(8);
		}
	}
}
