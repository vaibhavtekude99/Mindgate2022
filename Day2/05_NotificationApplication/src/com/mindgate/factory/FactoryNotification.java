package com.mindgate.factory;

import java.util.Scanner;

import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSNotifoication;
import com.mindgate.pojo.WhatsAppNotification;
import com.mindgate.service.Notification;

public class FactoryNotification 
{
	public static Notification getNotification(Scanner scanner,int choice)
	{
		Notification notification=null;
		
		switch(choice)
		{
		case 1: {
			notification = new SMSNotifoication();
			
			break;
		}
		case 2: {
			notification = new EmailNotification();
			break;

		}
		case 3: {
			notification = new WhatsAppNotification();
			break;

		}
		}
		return notification;
	}

}
