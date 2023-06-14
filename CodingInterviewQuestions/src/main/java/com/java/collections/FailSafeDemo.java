package com.java.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {

	public static void main(String[] args) {
		Map<String,String> ch = new ConcurrentHashMap<>();
		ch.put("1", "One");
		ch.put("2", "two");
		ch.put("3", "three");
		ch.put("4", "four");
		Iterator<Map.Entry<String,String>> it = ch.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			ch.put("5","five");
		}
		
		Iterator<String> itKey = ch.keySet().iterator();
		while(itKey.hasNext()) {
			String key  = itKey.next();
			String value = ch.get(key);
			System.out.println(key+" "+value);
			ch.put("6", "Six");
		}
	}
}
