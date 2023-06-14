package com.creational.singleton;

public class SingletonReflectionSol {

	public static void main(String[] args) {
			
		System.out.println(SingletonByEnum.INSTANCE);
		System.out.println(SingletonByEnum.INSTANCE);
	}
}

enum SingletonByEnum{
	INSTANCE;
}
