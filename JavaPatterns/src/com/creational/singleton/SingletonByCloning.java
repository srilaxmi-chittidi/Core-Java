package com.creational.singleton;

public class SingletonByCloning {

		public static void main(String[] args) throws CloneNotSupportedException, Exception{
			try {
				SingletonCloneEx s1 = SingletonCloneEx.singleInstance;

				SingletonCloneEx s2;
				s2 = (SingletonCloneEx) s1.clone();
				
				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

class SingletonCloneEx {//implements Cloneable{
	
	public static SingletonCloneEx singleInstance = new SingletonCloneEx();
	
	private SingletonCloneEx() {  } // private constructor

	
	@Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    } 
}