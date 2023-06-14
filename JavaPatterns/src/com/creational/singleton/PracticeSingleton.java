package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PracticeSingleton {
	public static void main(String args[]) throws FileNotFoundException, IOException,
	ClassNotFoundException, CloneNotSupportedException {
		
		Singleton4 instance1 = Singleton4.getInstance();
//		String fileName = "D:\\\\Lakshmi\\\\CoreJava\\\\workspace\\\\JavaPatterns\\\\src\\\\com\\\\java\\\\singleton\\\\output.txt";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
//		oos.writeObject(instance1);
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
//		Singleton4 instance2 = (Singleton4)ois.readObject();
//		
//		Singleton4 instance3 = (Singleton4) instance1.clone();
		Singleton4 instance4 = null;
		Constructor[] constructors = Singleton4.class.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			constructor.setAccessible(true);
			try {
				instance4 = (Singleton4) constructor.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			break;
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance4.hashCode());
		
		System.out.println(Singleton5.INSTANCE1.hashCode());
		System.out.println(Singleton5.INSTANCE2.hashCode());

	}
}
enum Singleton5{
	INSTANCE1, INSTANCE2;
}
class Singleton4 implements Serializable,Cloneable{
	public static Singleton4 single = new Singleton4();
	
	private Singleton4() {}
	
	protected Object readResolve() {
		return single;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	public static  Singleton4 getInstance() {
		if(single == null) {
			synchronized(Singleton4.class){
				if(single==null) {
					single =new Singleton4();
				}
			}
		}
		return single;
	}
	
	
}