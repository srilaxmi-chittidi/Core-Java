package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SigletonSerializationReadResolve {

	public static void main(String[] args) {
		
		String fileName = "D:\\Lakshmi\\CoreJava\\workspace\\JavaPatterns\\src\\com\\java\\singleton\\output.txt";

		SerializationReadResolve instance1 = SerializationReadResolve.instance; 
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(instance1);
		
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
			SerializationReadResolve instance2 = 	(SerializationReadResolve)in.readObject();
			
			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class SerializationReadResolve implements Serializable{
	
	public static SerializationReadResolve instance = new SerializationReadResolve();
	
	private SerializationReadResolve() {}
	
	protected Object readResolve() {
		return instance;
	}
}