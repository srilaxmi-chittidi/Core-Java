package com.creational.singleton;

public class SimpleSingleton {

	public static void main(String[] args) {
		try {
			SingletonEx s1 = SingletonEx.getInstance();
			System.out.println(s1);

			SingletonEx s2 = SingletonEx.getInstance();
			System.out.println(s2);

		} catch (SingleInstanceException e) {
			e.printStackTrace();
		}
		
	}

}

class SingletonEx {
	
	private static SingletonEx singleInstance = null;	//private static reference variable
	
	private SingletonEx() {   // private constructor
	}
	
	// static synchronized factory method
	public static synchronized SingletonEx getInstance() throws SingleInstanceException{
		
		if(singleInstance != null)
			throw new SingleInstanceException("This class already has an instance");
		else
			singleInstance = new SingletonEx();
		return singleInstance;

	}
}

class SingleInstanceException extends Exception{

	public SingleInstanceException(String string) {
		super(string);
	}
	
}