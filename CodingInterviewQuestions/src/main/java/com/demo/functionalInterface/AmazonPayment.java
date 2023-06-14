package com.demo.functionalInterface;

public class AmazonPayment implements UPIPayment {

	@Override
	public String doPayment(String source, String dest) {
		return null;
	}

	public static void main(String[] args) {
		System.out.println(UPIPayment.datePattern("yyyy-dd-MM"));
	}

}
