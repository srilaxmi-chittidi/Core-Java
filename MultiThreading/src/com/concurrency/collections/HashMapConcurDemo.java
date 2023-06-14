package com.concurrency.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcurDemo implements Runnable{// Thread{

	static Map<String,String> map =  new ConcurrentHashMap<>();

	public static void main(String[] args) throws InterruptedException {
		map.put("Two","two");
		map.put("Three", "three");
		
		HashMapConcurDemo h = new HashMapConcurDemo();
		Thread t = new Thread(h);
		t.start();
		
		
		for(Map.Entry<String, String> o:map.entrySet()) {
			System.out.println(o);
			Thread.sleep(1000);
		}
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
			map.put("One", "one");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
