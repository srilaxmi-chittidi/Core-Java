package com.creational.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternEx {

	public static void main(String[] args) throws CloneNotSupportedException{
		Vehical v1 = new Vehical();
		v1.insertData();
		
		Vehical v2 = (Vehical) v1.clone();
		List<String> newList = v2.getVehicalList();
		newList.add("New Honda");
		
		System.out.println(v1.getVehicalList());
		System.out.println(newList);

		System.out.println(v2.getVehicalList().remove("BMW"));
		System.out.println(newList);

	}

}
class Vehical implements Cloneable{
	private List<String> vehicalList;
	public Vehical() {
		this.vehicalList = new ArrayList<>();
	}
	public Vehical(List<String> list) {
		this.vehicalList = list;
	}
	public void insertData() {
		vehicalList.add("Honda Amaze");
		vehicalList.add("Tesla");
		vehicalList.add("BMW");
		vehicalList.add("Maruti Baleno");
		vehicalList.add("i10");
	}
	public List<String> getVehicalList(){
		return vehicalList;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> tempList = new ArrayList<String>();
		for(String s: this.getVehicalList()) {
			tempList.add(s);
		}
		return new Vehical(tempList);
	}
}