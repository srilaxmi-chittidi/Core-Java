package com.arrays.interviewQuestions;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {

	public static void main(String args[]) {
		ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<>();
		chm.put(1, "One");
		chm.put(2, "Two");
		chm.put(3, "Three");
		
		Iterator<Map.Entry<Integer, String>> it = chm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,String> map = it.next();
			System.out.println(map.getKey()+ " "+ map.getValue());
			chm.put(4, "Four");
		}
	}
}
