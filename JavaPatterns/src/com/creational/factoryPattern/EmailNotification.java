package com.creational.factoryPattern;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Email notification..");
	}

}
