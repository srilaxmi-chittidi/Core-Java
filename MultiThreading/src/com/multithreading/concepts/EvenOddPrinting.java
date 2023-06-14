package com.multithreading.concepts;

import java.util.stream.IntStream;

public class EvenOddPrinting {

	public static void main(String[] args) {
		Thread  t1 = new Thread(new EvenNumPrinting());
		Thread  t2 = new Thread(new OddNumPrinting());
		t1.setName("Even Number Thread");
		t2.setName("Odd Number Thread");
		
		t1.start();
		t2.start();
	}
	public static void printVal(int i) {
		StringBuffer sb = new StringBuffer(" i ");
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}

class EvenNumPrinting implements Runnable{

	@Override
	public void run() {
		
		IntStream.rangeClosed(1, 20)
					.filter(x->x%2==0)
					.forEach(EvenOddPrinting :: printVal);
	}
}

class OddNumPrinting implements Runnable{

	@Override
	public void run() {
		IntStream.rangeClosed(1, 20)
					.filter(x->x%2!=0)
					.forEach(EvenOddPrinting :: printVal);
	}
}