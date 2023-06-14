package com.java8.LocalDate;

import java.time.LocalDate;

public class Java8Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dateAPI();
	}

	public static void dateAPI() {
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getMonth());
		//ld.plus(9);
	}
}
