package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		int employeeId;
		String name;
		double salary;
		 
		System.out.println("Enter EmployeeId");
		employeeId=scanner.nextInt();
		
		System.out.println("Enter name:");
		name=scanner.next();
		
		System.out.println("enter salary");
		salary=scanner.nextDouble();
		
		Employee employee=new Employee();
		employee.setEmployeeId(101);
		employee.setName("Vaibhav");
		employee.setSalary(2000);
		
		
		System.out.println(employee.getEmployeeId());
	     System.out.println(employee.getName());
	     System.out.println(employee.getSalary());
	     System.out.println("_".repeat(50));
	     
	     Employee employee2=new Employee(employeeId, name, salary);
		

			System.out.println(employee2.getEmployeeId());
		     System.out.println(employee2.getName());
		     System.out.println(employee2.getSalary());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
