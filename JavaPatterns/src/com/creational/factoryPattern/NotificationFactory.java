package com.creational.factoryPattern;

public class NotificationFactory {

		public Notification createNotification(String type) throws Exception {
			if(type == null || type.isEmpty())
				return null;
			switch(type) {
			case "EMAIL" :	return new EmailNotification(); 
			case "SMS" :	return new SMSNotification(); 
			case "PUSH" :	return new PushNotification();
			default :	throw new Exception();			
			}
		}
}
