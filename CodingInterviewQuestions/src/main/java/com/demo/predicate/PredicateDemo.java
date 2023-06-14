package com.demo.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = (t) -> t>0;//) ? true : false;
		
		System.out.println("Given number is positive number "+ p.test(-45));
		
	}

}
