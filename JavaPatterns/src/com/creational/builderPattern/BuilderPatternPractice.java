package com.creational.builderPattern;

public class BuilderPatternPractice {

	public static void main(String[] args) {
		Vehical1 car = new Vehical1
				.VehicalBuilder(4,"CarEngine")
				.setAirBags(true)
				.build();
		Vehical1 bike = new Vehical1
				.VehicalBuilder(2, "BikeEngine")
				.build();
		System.out.println(car.isAirbags()+" "+car.getEngine()+" "+car.getWheels());
		System.out.println(bike.isAirbags()+" "+bike.getEngine()+" "+bike.getWheels());
	}
}

class Vehical1{
	private int wheels;
	private String engine;
	//optional params
	private boolean airbags;
	public int getWheels() {
		return wheels;
	}
	public String getEngine() {
		return engine;
	}
	public boolean isAirbags() {
		return airbags;
	}
	private Vehical1(VehicalBuilder builder) {
		this.wheels = builder.wheels;
		this.engine = builder.engine;
		this.airbags = builder.airbags;
	}
	public static class VehicalBuilder {
		private int wheels;
		private String engine;
		//optional params
		private boolean airbags;

		public VehicalBuilder(int wheels,String engine) {
			this.wheels = wheels;
			this.engine = engine;
		}
		public VehicalBuilder setAirBags(boolean airbags) {
			this.airbags = airbags;
			return this;
		}
		public VehicalBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}
		public VehicalBuilder setWheels(int wheels) {
			this.wheels = wheels;
			return this;
		}
		public Vehical1 build() {
			return new Vehical1(this);
		}
	}
}
