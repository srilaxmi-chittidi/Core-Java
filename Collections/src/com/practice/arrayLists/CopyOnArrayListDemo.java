package com.practice.arrayLists;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list2 = new CopyOnWriteArrayList<String>();
		list2.add("Tom");
		list2.add("Ram");
		list2.add("Sita");
		list2.add("Tom");
		//Explicit synchronization is needed for iterating it 
		Iterator<String> it = list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			list2.add("Laxman");
		}
	}

}
