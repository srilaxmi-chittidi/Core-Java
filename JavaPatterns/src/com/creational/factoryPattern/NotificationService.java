package com.creational.factoryPattern;

public class NotificationService {

	public static void main(String[] args) throws Exception {
		NotificationFactory nf = new NotificationFactory();
		Notification n = nf.createNotification("SMS");
		n.notifyUser();
	}

}
