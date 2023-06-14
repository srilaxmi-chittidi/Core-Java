package com.creational.singleton;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PracticeSingletonPattern {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		
		MySingleton m1 = MySingleton.getInstance();
		MySingleton m2 = (MySingleton) m1.clone();
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}

}


class MySingleton implements Cloneable{
	public static MySingleton mySingleton = new MySingleton();
	
	private MySingleton() {}
	
	public  static MySingleton getInstance() {
		
		if(mySingleton == null) {
			synchronized(MySingleton.class) {
				if(mySingleton == null) {
					mySingleton = new MySingleton();
				}
			}
		}
		return mySingleton;}
	@Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    } 
	//protected Object readResolve() {return mySingleton;}

}