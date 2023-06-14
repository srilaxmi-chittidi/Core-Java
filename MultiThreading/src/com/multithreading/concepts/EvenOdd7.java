package com.multithreading.concepts;

import java.util.stream.IntStream;

public class EvenOdd7 {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,4,5};
		EvenOdd7 obj = new EvenOdd7();
		Thread even = new Thread(new Runnable() {
			@Override
			public void run() {
				IntStream.rangeClosed(1,10).filter(e->e%2==0).forEach(EvenOdd7 :: printVal);
				try {
					obj.wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		Thread odd = new Thread(new Runnable() {

			@Override
			public void run() {
				IntStream.rangeClosed(1,10).filter(e->e%2!=0).forEach(EvenOdd7 :: printVal);
				obj.notify();
			}
		});
		
		even.start();
		odd.start();
	}
	public static void printVal(int i) {
		StringBuffer sb = new StringBuffer(" i ");
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
