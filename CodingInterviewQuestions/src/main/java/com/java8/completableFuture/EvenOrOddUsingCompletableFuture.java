package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOrOddUsingCompletableFuture {

	private static Object object = new Object();
	
	private static IntPredicate evenCond =  e->e%2 == 0;
	private static IntPredicate oddCond =  e->e%2 != 0;
	
	public static void main(String[] args) throws InterruptedException{
		CompletableFuture.runAsync(() -> EvenOrOddUsingCompletableFuture.printNumber(oddCond));
		CompletableFuture.runAsync(() -> EvenOrOddUsingCompletableFuture.printNumber(evenCond));
		Thread.sleep(1000);
	}
	
	public static void printNumber(IntPredicate condition) {
		IntStream.rangeClosed(0, 10).forEach(EvenOrOddUsingCompletableFuture :: execute);
	}
	
	public static void execute(int i) {
		synchronized(object) {
			try {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				object.notify();
				object.wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();	
			}
		}
	}
	
}
