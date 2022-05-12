package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {

	public static void main(String[] args) {
       Account account=new Account(101,"Vaibhav Tekude",1000);
       boolean result=account.withdraw(500);
       if(result)
       {
    	   System.out.println("Transaction Completed Successfuly");
    	   System.out.println("Balance:: "+account.getBalance());
       }
       else
       {
    	   System.out.println("Transaction failed!!!!!!!!!");
    	   System.out.println("Balance:: "+account.getBalance());
       }
       System.out.println("_".repeat(50));
       //deposit
       result=account.deposit(5000);
       if(result)
       {
    	   System.out.println("Deposited Completed Successfuly");
    	   System.out.println("Balance:: "+account.getBalance());  
       }
       else
       {
    	   System.out.println("Transaction failed!!!!!!!!!");
    	   System.out.println("Balance:: "+account.getBalance());  
       }
	}

}
