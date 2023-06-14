package com.demo.Function;

import java.util.function.Function;

public class FunctionDemo {

	public static  void main(String[] args) {

		// Step1 - case A
		Function<Integer , String> f = (t) -> {
			return "output:" + t;
		};
		
		//Step1 - case B
		Function<Integer,String> f1 = (t) -> "Output:" + t;
	
		//Step2
		
		System.out.println(f1.apply(45));	
	}

}

/**
 * Function takes argument and returns value
 * Here Function<Integer, String> , First argument is input and second argument is output
 * it has apply() method
 * 
 * This process has 2 steps
 * 	1. We need to provide implementation for abstract method( apply) 
 *  2. Second , we need call its abstract method using function reference
 */
