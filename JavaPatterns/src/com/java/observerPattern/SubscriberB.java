package com.java.observerPattern;

public class SubscriberB implements Subscriber {

	Publisher p = new PublisherImpl();

	@Override
	public void notifyMe(Subscriber s) {
		System.out.println("Is it unsubscribed ? "+p.unregisterObserver(s));		
		
	}

}
