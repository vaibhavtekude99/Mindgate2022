package com.mindgate.pojo;

public class Current extends Account
{
    private double overdraftBalance;
      double tempOD;
    
    public Current() {
    	System.out.println("Default Constructor of current");
	}

	public Current(int accountNumber, String name, double balance,double overdraftBalance) {
		super(accountNumber, name, balance);
		      this.overdraftBalance=overdraftBalance;
		      tempOD=this.overdraftBalance;
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
			
			if(overdraftBalance+amount==tempOD || overdraftBalance+amount<tempOD )
			{ 
				setOverdraftBalance(overdraftBalance+amount);   
				return true;
			}
			if(overdraftBalance+amount>tempOD)
			{
				double tempans=(overdraftBalance+amount)-tempOD;
				setBalance(tempans);
				setOverdraftBalance(tempOD);
				return true;
			}
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
