package com.creational.builderPattern;

public class VehicalBuilderPattern {
	public static void main(String[] args) {
		Vehical car = new Vehical.VehicalBuilder("sdf","dfd").setWheels("ere").build();
		System.out.println(car.getAirbags()+" "+car.getEngine()+" "+car.getWheels());
	}
}

class Vehical{
	private String engine;
	private String airbags;
	private String wheels;
	
	public String getEngine() {
		return engine;
	}
	public String getAirbags() {
		return airbags;
	}
	public String getWheels() {
		return wheels;
	}
	private Vehical(VehicalBuilder builder) {
		this.engine = builder.engine;
		this.airbags = builder.airbags;
		this.wheels = builder.wheels;
	}
	public static class VehicalBuilder{
		
		private String engine;
		private String airbags;
		private String wheels;
		
		public VehicalBuilder(String engine,String airbags) {
			this.airbags =airbags;
			this.engine = engine;
		}
		public VehicalBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}
		public VehicalBuilder setAirbags(String airbags) {
			this.airbags = airbags;
			return this;
		}
		public VehicalBuilder setWheels(String wheels) {
			this.wheels = wheels;
			return this;
		}
		public Vehical build() {
			return new Vehical(this);
		}
	}
}