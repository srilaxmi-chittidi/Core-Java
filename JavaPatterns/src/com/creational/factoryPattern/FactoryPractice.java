package com.creational.factoryPattern;

public class FactoryPractice {
	public static void main(String[] args) {
		Vehical v = VehicalFactory.getInstance(2);
		System.out.println(" "+v.getWheel());
	}
}
abstract class Vehical{
	public abstract int getWheel();
	public String toString() {
		return "Wheel: "+this.getWheel();
	}
}
class Car extends Vehical{
	private int wheel;
	public Car(int wheel) {
		this.wheel = wheel;
	}
	@Override
	public int getWheel() {
		return this.wheel;
	}
	public String toString() {
		return "Car has "+super.toString();
	}
}
class Bike extends Vehical{
	private int wheel;
	public Bike(int wheel) {
		this.wheel = wheel;
	}
	@Override
	public int getWheel() {
		return this.wheel;
	}
	public String toString() {
		return "Car has "+super.toString();
	}
}
class VehicalFactory{
	public static Vehical getInstance(int wheel) {
		if(wheel == 4) {
			return new Car(wheel);
		}if(wheel == 2) {
			return new Bike(wheel);
		}
		return null;
	}
}