package com.java8.interfaces;

import java.util.Arrays;
import java.util.List;

interface inter1{
	default void print() {
		System.out.println("Printing from inter1 deafault method");
	}
	static void static1() {
		System.out.println("Printing from inter1 static method");
	}
}
interface inter2{
	default void print1() {
		System.out.println("Printing from inter2 deafault method");
	}
	static void static1() {
		System.out.println("Printing from inter1 static method");
	}
}
public class DefaultAmbigDemo implements inter1,inter2{

	public static void main(String[] args) {
		DefaultAmbigDemo d = new DefaultAmbigDemo();
		d.print();
		inter1.static1();
		
		List<Integer> list = Arrays.asList(12,45,63,32,90);
		System.out.println(list.removeIf(i->i%2==0));
	}

}
