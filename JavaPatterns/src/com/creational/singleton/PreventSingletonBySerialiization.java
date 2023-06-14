package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PreventSingletonBySerialiization {

	public static void main(String[] args) {
		
		try {
			SingletonSerializable singleton1 = SingletonSerializable.instance;
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Lakshmi\\CoreJava\\workspace\\JavaPatterns\\src\\com\\java\\singleton\\output.txt"));
			out.writeObject(singleton1);
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Lakshmi\\CoreJava\\workspace\\JavaPatterns\\src\\com\\java\\singleton\\output.txt"));
			SingletonSerializable singleton2 = 	(SingletonSerializable)in.readObject();
			in.close();
			
			System.out.println("instance1 hashCode:- " + singleton1.hashCode());
			System.out.println("instance2 hashCode:- " + singleton2.hashCode());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

class SingletonSerializable implements Serializable{
	
	public static SingletonSerializable instance = new SingletonSerializable();
	
	private SingletonSerializable() {}
	
}
