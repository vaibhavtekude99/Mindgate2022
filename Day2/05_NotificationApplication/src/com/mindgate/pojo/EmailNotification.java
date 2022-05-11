package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class EmailNotification implements Notification {

	@Override
	public void sendNotification(String to, String message) {
        System.out.println("This is Email notification"+message);		
	}

}
