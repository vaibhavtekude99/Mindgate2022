package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.FactoryNotification;
import com.mindgate.pojo.SMSNotifoication;
import com.mindgate.service.Notification;

public class NotificationApplicationMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String to;
		String message;
		int choice;
		
		System.out.println("1. SMS notificatipon");
		System.out.println("2. Email notificatipon");
		System.out.println("3. WhatsApp notificatipon");
		choice=scanner.nextInt();
		
		
		System.out.println("Enter the contact:  ");
		to=scanner.next();
		scanner.nextLine();
		System.out.println("Enter the Message: ");
		message=scanner.nextLine();
		
		
		
		Notification notification;
		notification =FactoryNotification.getNotification(scanner,choice);
		notification.sendNotification(to, message);
		
		
	}

}
