package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationMainV6 {

	public static void main(String[] args) {

		Current current=new Current(101, "Vaibahv", 10000, 50000);
		System.out.println(current);
		
		System.out.println("Withdraw 50000");
		current.withdraw(50000);
		System.out.println(current);
		
		
		System.out.println("Deposit 50000");
		current.deposit(45000);
		System.out.println(current);
	}

}
