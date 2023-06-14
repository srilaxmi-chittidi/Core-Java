package com.java.patterns;

import java.util.HashMap;
import java.util.Map;

final class MyImmutableClass {			//final class

	private final int intVal ;				// private data members
	private final String stringVal;     // And final data members
	private final Address address ;
    private final Map<String, String> metadata= new HashMap<String, String>();

	
	MyImmutableClass(int intVal, String stringVal,Address addr){
		this.intVal = intVal;
		this.stringVal = stringVal;
		Address addressTemp = new Address(123,"R-15","Tracy","CA");
	    Map<String, String> tempHashMap = new HashMap<String, String>();

	    for (Map.Entry<String, String> entry :
            metadata.entrySet()) {
	    	tempHashMap.put(entry.getKey(), entry.getValue());
       }

      // this.metadata = tempHashMap;
	   this.address = addressTemp;
		//this.address = addr;
	    }

	public Map<String, String> getMetadata()
    {
 
        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();
 
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
	public int getIntVal() {
		return intVal;
	}

	public String getStringVal() {
		return stringVal;
	}

	public Address getAddress() {
		return this.address;
	}
}

public class ImmutableClassDemo{
	public static void main(String[] args) {
		Address addressDemo = new Address(1,"derf","hyd","AP");
		MyImmutableClass my = new MyImmutableClass(23,"sdf",addressDemo);
		System.out.println(my.getAddress());
	
		
	} 	

}

class Address{
	
	public Address() {
		
	}
	public Address(int hNo,String streetNo,String city,String state) {
		this.hNo = hNo;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
	}
	int hNo;
	public int gethNo() {
		return hNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	String streetNo;
	String city;
	String state;
	
	public String toString() {
		return this.gethNo()+" "+this.getStreetNo()+" "+this.getCity()+" "+this.getState();
	}
}