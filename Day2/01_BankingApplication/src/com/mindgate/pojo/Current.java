package com.mindgate.pojo;

public class Current extends Account
{
    private double overdraftBalance;
    
    public Current() {
    	System.out.println("Default Constructor of current");
	}

	public Current(int accountNumber, String name, double balance,double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance=overdraftBalance;
		System.out.println("Overloaded Constructor of Current");
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		if(amount>0)
		{
			if(amount<=getBalance())
			{
				setBalance(getBalance()-amount);
				return true;
			}
			if(amount>getBalance())
			{
				double withdrawFromOD=getBalance()-amount;
				setOverdraftBalance(overdraftBalance+withdrawFromOD);
				setBalance(0);
				return true;
			}
		}
		
    return false;
	}
	
	@Override
	public boolean deposit(double amount) {
		
		if(amount>0)
		{
			double tempOD=overdraftBalance;
			if(getBalance()==0  )
			{ 
				tempOD=tempOD-amount;
				if(tempOD<0)
				{
			   	 setOverdraftBalance(amount+overdraftBalance-this.overdraftBalance);
			   	    double temp=tempOD+amount+overdraftBalance-this.overdraftBalance;
			   	   setBalance(temp);
			   	  return true;
				}
				else
				{
					setOverdraftBalance(amount);
				}
			   	return true;
			}
		}
			else
			{
				setBalance((getBalance()+amount));
			}
			
			
		
		
		
    return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance= " + overdraftBalance +" Account Balance: "+getBalance()+ "]";
	}
	
    
}
