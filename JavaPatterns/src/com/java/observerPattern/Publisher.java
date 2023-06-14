package com.java.observerPattern;

import java.util.ArrayList;
import java.util.List;

public interface Publisher {
	
	List<Subscriber> subscriberList = new ArrayList<Subscriber>();
	
	boolean registerObserver(Subscriber s);
	boolean unregisterObserver(Subscriber s);
}
