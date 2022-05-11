package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class ShapoesMain {
    public static void main(String[] args) {
		System.out.println("Enter Your Choice \n 1.for circle \n  2. for Triangle \n 3.for Sqaure");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		Shapes shapes=ShapesFactory.getShapes(choice);
		
		if(shapes !=null)
		shapes.draw();
		
		else
			System.out.println("This is invalid Choice");
		
	}
}
