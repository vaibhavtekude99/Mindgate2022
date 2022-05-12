package com.mindgate.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {

      private Set<Employee> employeeSet=new HashSet<Employee>();
      
      
      // add new Employee
      public boolean addNewEmployee(Employee employee)
      {
    	  if(employee !=null)
    	  {
    	 boolean ans= employeeSet.add(employee);
    	 System.out.println(employee);
    	  return ans;
    	  }
    	  return false;
    	  
      }
      
      //update existing employee
      public boolean updateEmployee(int employeeId,String name,double salary)
      {
    	 for (Employee setEmployee : employeeSet) {
			if(setEmployee.getEmployeeId()==employeeId)
			{
				setEmployee.setName(name);
				setEmployee.setSalary(salary);
				return true;
			}
		}
    	  
    	  return false;
    	  
      }
      
      //delete Employee
      
      public boolean deleteEmployee(int employeeId)
      {
              for (Employee employee : employeeSet) {
				if(employee.getEmployeeId()==employeeId)
				{
					return employeeSet.remove(employee);
				}
			}
    	  return false;
      }
      
      //get single employee by employeeId
      
      public Employee getEmployeeByEmployeeId(int employeeId)
      {
             Employee employee1;
 		for (Employee employee : employeeSet)
 		{
			if(employee.getEmployeeId()==employeeId)
			{
				employee1=employee;
				return employee;
			}
		}

 		return null;
 				
    	  
      }
      //get all the Employees
      public Set<Employee> getAllEmployee()
      {
    	  return employeeSet;
      }
      
      
      
}
