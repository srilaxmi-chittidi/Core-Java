package com.java.observerPattern;

public class PublisherImpl implements Publisher {

	@Override
	public boolean registerObserver(Subscriber s) {
		return subscriberList.add(s);
	}

	@Override
	public boolean unregisterObserver(Subscriber s) {
		return subscriberList.remove(s);
	}

}
