package com.creational.singleton;

public class DoubleCheckSingleton {

	public static void main(String[] args) {
		try {
			SingletonEx2 s1 = SingletonEx2.getInstance();
			System.out.println(s1);

			SingletonEx2 s2 = SingletonEx2.getInstance();
			System.out.println(s2);

		} catch (SingleInstanceException e) {
			e.printStackTrace();
		}
		
	}

}

class SingletonEx2 {
	
	private static SingletonEx2 singleInstance = null;	//private static reference variable
	
	private SingletonEx2() {   // private constructor
	}
	
	// Double check locking
	public static  SingletonEx2 getInstance() throws SingleInstanceException{
		
		if(singleInstance == null) {
			synchronized(SingletonEx2.class) {
				if(singleInstance == null) {
					singleInstance = new SingletonEx2();
				}
			}
		}
		return singleInstance;
	}
}

