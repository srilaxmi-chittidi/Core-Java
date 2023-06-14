package com.creational.factoryPattern;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending SMS notification..");
	}
}
