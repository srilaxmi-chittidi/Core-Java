package com.demo.functionalInterface;

public class SimplifyFunctionaIInterface {

	public static void main(String[] args) {

		/**
		 * Step1 to simplify
		 */
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Step1 to simplify");
			}
		};
		
		/*
		 * Step2 to simplify
		 */
		Runnable r2 = () -> {
			System.out.println("Step2 to simplify");
		};
		
		
		/**
		 * Step3 to simplify
		 */
		
		Runnable r3 =() -> System.out.println("Step2 to simplify");

	}
	
}