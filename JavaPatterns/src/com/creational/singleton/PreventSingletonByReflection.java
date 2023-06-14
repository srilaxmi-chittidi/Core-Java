package com.creational.singleton;

import java.lang.reflect.Constructor;

public class PreventSingletonByReflection {

	public static void main(String[] args) {
		
		SingletonEx3 singleton1 = SingletonEx3.singletonNReflection;
		SingletonEx3 singleton2 = null;
		
		try{
			Constructor[]  constructors = 
					SingletonEx3.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				singleton2 = (SingletonEx3) constructor.newInstance();
				break;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

	}
}


class SingletonEx3{
	
	public static SingletonEx3 singletonNReflection = new SingletonEx3();
	
	private SingletonEx3() {}
	
	/*public static SingletonEx3 getInstance() {
		
		if (singletonNReflection == null) {
			synchronized(SingletonEx3.class) {
				if(singletonNReflection == null) {
					singletonNReflection = new SingletonEx3();
				}
			}
		}
		return singletonNReflection;
	}*/
}
