package com.creational.singleton;

public class StaticClassDemo {

	private static int x =7;
	public int y = 10;
	private int z = 3;
	
	public static void main(String[] args) {
		StaticClassDemo.StaticClassEx staticInnerClass = 
				new StaticClassDemo.StaticClassEx();
		
		
	}
	/* 1. InnerClass
	 * 2. Can access only static member of this outer class
	 */
	static class StaticClassEx{
	
		StaticClassEx(){
			System.out.println("Private static member "+x);
			//System.out.println("Public non-static member "+y);	Not-accessible
			//System.out.println("Private non-static member "+z);  Not-accessible

		}
	}


}