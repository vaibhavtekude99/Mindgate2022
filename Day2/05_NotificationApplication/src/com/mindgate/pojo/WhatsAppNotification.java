package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class WhatsAppNotification implements Notification
{
      @Override
    public void sendNotification(String to, String message) {

   System.out.println("This is WhatsApp Notification "+message);
        	
    }
}
