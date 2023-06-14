package com.practice.arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListDemo {

	public static void main(String[] args) {
		List<String> list1 = Collections.synchronizedList(new ArrayList<>());
		list1.add("Tom");
		list1.add("Ram");
		list1.add("Sita");
		list1.add("Tom");
		//Explicit synchronization is needed for iterating it 
		synchronized(list1) {
			Iterator<String> it = list1.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}

}
