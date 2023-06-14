package com.creational.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypePractice {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehical2 v1 = new Vehical2();
		v1.insertData();
		System.out.println(v1);
		
		Vehical2 v2 = v1.clone();
		System.out.println(v2);
		
	}
}
class Vehical2 implements Cloneable{
	private List<String> list ;
	public Vehical2() {
		this.list = new ArrayList<>();
	}
	public Vehical2(List<String> list) {
		this.list=list;
	}
	public void insertData() {
		list.add("Maruthi");
		list.add("BMW");
		list.add("Honda");
		list.add("Hyundai");
		list.add("Tesla");
	}
	public List<String> getVehicals(){
		return list;
	}
	@Override
	public Vehical2 clone() throws CloneNotSupportedException{
		List<String> vlist = new ArrayList<>();
		for(String v:this.getVehicals()) {
			vlist.add(v);
		}
		return new Vehical2(vlist);
	}
	@Override
	public String toString() {
		return list.toString();
	}
}
