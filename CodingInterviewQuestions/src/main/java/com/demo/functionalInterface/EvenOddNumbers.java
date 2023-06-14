package com.demo.functionalInterface;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddNumbers {
	
	private static Object object = new Object();
	
	private static IntPredicate evenCond = e ->e%2 == 0;
	private static IntPredicate oddCond = e ->e%2 != 0;
	
	public static void main(String[] args) throws InterruptedException {
		CompletableFuture.runAsync(() -> EvenOddNumbers.printNumber(evenCond));
		CompletableFuture.runAsync(() -> EvenOddNumbers.printNumber(oddCond));
		Thread.sleep(1000);
	}
	
	public static void printNumber(IntPredicate condition) {
		IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenOddNumbers :: execute);
	}

	public static void execute(int t) {
		synchronized(object) {
		try {
			System.out.println(Thread.currentThread().getName()+" "+t);
			object.notify();
			object.wait();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		}
	}
}

