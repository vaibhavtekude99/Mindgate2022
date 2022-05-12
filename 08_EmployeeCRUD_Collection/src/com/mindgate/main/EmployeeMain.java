package com.mindgate.main;

import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		
		EmployeeDAO employeeDAO=new EmployeeDAO();
		
		
		operations(employeeDAO,scanner);
		System.out.println("If you want to continue operations enter 1.\n else 2.");
		int choice=scanner.nextInt();
		
		while(choice!=2)
		{
		switch (choice) {
		case 1: {
			operations(employeeDAO, scanner);
			break;
		}
		case 2: {
			System.out.println("Thank you!!!!!!!!!!");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		}
	}
		
   public static void operations(EmployeeDAO employeeDAO2, Scanner scanner)
   {

		EmployeeDAO employeeDAO=new EmployeeDAO();
		System.out.println("Please Enter Your Choice");
		System.out.println("1. For add new Employee");
		System.out.println("2. For update employee ");
		System.out.println("3. For delete employee by Id");
		System.out.println("4. For to get single employee details");
		System.out.println("5. For Get all employees ");
		
		int choice=scanner.nextInt();
		
		switch (choice) 
		{
		
		    case 1: {
			     System.out.println("Please enter the epmloyeeI");
			     int employeeId=scanner.nextInt();
			     
			     System.out.println("Please enter the employee name: ");
			     String name=scanner.next();
			     
			     System.out.println("Please enter Employee Salary: ");
			     double salary=scanner.nextDouble();
			     
			   Employee employee=  new Employee(employeeId, name, salary);
			  if( employeeDAO.addNewEmployee(employee))
			  {
				  System.out.println("The employee Added successfully");
			  }
			  else
			  {
				  System.out.println("Failed to add the employee");
			  }
			     break;
		   }
		    case 2:
		    {
		    	System.out.println("Please enter the epmloyeeId");
			     int employeeId=scanner.nextInt();
			     
			     System.out.println("Please enter the  new employee name: ");
			     String name=scanner.next();
			     
			     System.out.println("Please enter Employee new Salary: ");
			     double salary=scanner.nextDouble();
			     
			     
			     if(employeeDAO.updateEmployee(employeeId, name, salary))
			     {
			    	 System.out.println("Updated Successfully");
			     }
			     else
			    	 System.out.println("Unable to update");
			     break;
		    }
		    case 3:
		    {
		    	System.out.println("Please enter the epmloyeeId");
			     int employeeId=scanner.nextInt();
			     
			     if(employeeDAO.deleteEmployee(employeeId))
			     {
			    	 System.out.println("Deleted Successfully");
			     }
			     else
			    	 System.out.println("Unable to delete");
			     
			     
			     break;
		    }
		    case 4:
		    {
		    	System.out.println("Please enter the epmloyeeId");
			     int employeeId=scanner.nextInt();
			     
			     
			     System.out.println(employeeDAO.getEmployeeByEmployeeId(employeeId));
			     
			     break;
		    }
		    case 5:
		    {
		    Set<Employee> employeeSet=employeeDAO.getAllEmployee();
		    System.out.println(employeeSet);
		    break;
		    }
		    default:
		    	System.out.println("You entered wrong input");
		    	break;
		}
		
  
   }
	

}
