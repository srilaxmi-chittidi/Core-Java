package com.java.observerPattern;

public class SubscriberA implements Subscriber {

	Publisher p = new PublisherImpl();
	
	@Override
	public void notifyMe(Subscriber s) {
		System.out.println("Is it subscribed ? "+p.registerObserver(s));		
	}

}
