package com.arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class CustomConcurException extends Thread{

	static List<String> list = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException{
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		CustomConcurException t = new CustomConcurException();
		t.start();
		list.stream().forEach(System.out::println);

	}

	@Override
	public void run() {
		try {
		Thread.sleep(1000);
		list.add("five");
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
