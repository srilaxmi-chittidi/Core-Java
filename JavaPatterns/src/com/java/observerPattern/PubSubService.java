package com.java.observerPattern;

public class PubSubService {

	public static void main(String[] args) {
		Subscriber subA = new SubscriberA();
		Subscriber subB = new SubscriberB();
		
		subA.notifyMe(subA);
		subB.notifyMe(subB);
	}

}
