package org.test.dp.structural.facade.model;

public class BankAccount
{
	private Double balance;
	
	public Double getBalance()
	{
		return balance;
	}
	
	public void setBalance(final Double amount)
	{
		balance = amount;
	}
	
	public void initializeAccount()
	{
		setBalance(1000.00D);
	}
	
	public void deductAmount(final Double amount)
	{
		Double newBalance = getBalance() - amount; 
		if (newBalance > 0) setBalance(newBalance);
		else throw new RuntimeException("Bank error...");
	}
}
