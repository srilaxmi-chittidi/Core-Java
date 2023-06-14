package com.demo.functionalInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 
 * Functional Interface basic prg demo
 *
 */
@FunctionalInterface
public interface UPIPayment {

	String doPayment(String source,String dest);
	
	static String datePattern(String patterns) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
		return dateFormat.format(new Date());
	}
	
	default double getScratchCard() {
		return new Random().nextDouble();
	}
}
