package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Saving;

public class AccountApplicationMainV5 {
	static {
		System.out.println("++++++++++++ Welcome to XYZ Bank+++++++++++++++++++++++++++ ");
	}

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
	     String name;
	     double balance;
	     int accountNumber;
	     boolean result;
	     boolean isSalary;
	     
		System.out.println("Enter the name: ");
		name=scanner.next();
		
		System.out.println("Enter the AccountNumber:");
		accountNumber=scanner.nextInt(); 
		
		
		System.out.println("Enter the Balance:");
		balance=scanner.nextDouble();
		
		System.out.println("Do you want to open salary account? true or false");
		isSalary=scanner.nextBoolean();
		Account account =new Saving(accountNumber, name, balance, isSalary);
		
		System.out.println("Account Opened Successfully");
		
		
		//transaction menu
		tansaction(account,scanner);
		
		System.out.println("If you want to continue enter 'yes' else enter 'no' ");
		String continueChoice=scanner.next();
		  if(continueChoice.equalsIgnoreCase("yes"))
			tansaction( account,scanner);
			
		  else if(continueChoice.equalsIgnoreCase("NO"))
				  {
			         System.out.println("Thank you for Banking with us!!!!");
			
		          }
		  else
		  {
			  System.err.println("You entered wrong input");
		  }

		
		
	   
	}
	public static void tansaction(Account account,Scanner scanner)
	{
		System.out.println("pleas enter your operation 1. for withdraw,2. for Deposit,3. for check balance");
		int num=scanner.nextInt();
		switch (num) {
		case 1: 
		{
			System.out.print("Enter amount to withdraw:" );
			double amount=scanner.nextDouble();
			boolean result=account.withdraw(amount);
			if(result)
			{
				System.out.println("withdraw successfylly");
				System.out.println("Balance:: "+account.getBalance());
			}
			else
			{
				System.out.println("Failed");
				System.out.println("Balance:: "+account.getBalance());
			}
			break;
		}
		case 2: 
		{
			System.out.print("Enter amount to Deposit:" );
			double amount=scanner.nextDouble();
			boolean result=account.deposit(amount);
			if(result)
			{
				System.out.println("Dposited successfylly");
				System.out.println("Balance:: "+account.getBalance());
			}
			else
			{
				System.out.println("Failed");
				System.out.println("Balance:: "+account.getBalance());
			}
			break;
		}
		case 3: 
		{
			
		System.out.println(account.getBalance());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
		
			
	}

}
