package com.creational.AbstracFactoryPattern;

public class OtherFactoryDesignPattern {

	public static void main(String[] args) {
		Vehical car = VehicalFactory.getInstance("car");
		Vehical bike = VehicalFactory.getInstance("bike");
		car.wheels(4);
		bike.wheels(2);
	}

}
interface Vehical{
	public void wheels(int no);
}

class Car implements Vehical{
	@Override
	public void wheels(int no) {
		System.out.println("Car has "+no+" wheels");
	}
}
class Bike implements Vehical{
	@Override
	public void wheels(int no) {
		System.out.println("Bike has "+no+" wheels");
	}
}
class VehicalFactory {
	public static Vehical getInstance(String v) {
		if(v=="car") return new Car();
		if(v=="bike") return new Bike();
		return null;
	}
}