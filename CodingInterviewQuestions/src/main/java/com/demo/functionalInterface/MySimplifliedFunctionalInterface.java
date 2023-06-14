package com.demo.functionalInterface;

public class MySimplifliedFunctionalInterface {

	public static void main(String[] args) {
		
		/**
		 * Step1 Implementation of function in functional interface
		 */
		MyFunction function1 = new MyFunction() {

			@Override
			public String addTest(String s1, String s2) {
				return s1+" "+s2;
			}
		};

		/**
		 * Step2
		 */
		MyFunction function2 = (s1, s2) -> {
			return s1+" "+s2;
		};

		/**
		 * Step3
		 */
		MyFunction function3 = (s1, s2) -> s1+" "+s2;
		
		System.out.println(function3.addTest("Hello", "World"));
	}

}
