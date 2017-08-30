package org.test.dp.structural.facade.model;

/**
 * A Facade shields the user from the complex details of the system and provides them with a simplified view of it which is easy to use.
 * It also decouples the code that uses the system from the details of the subsystems, making it easier to modify the system later.
 * It provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 * Can be related to Abstract Factory creational design pattern.
 */
public class FacadeSystem
{
	Stock stock;
	BankAccount acct;
	
	public FacadeSystem()
	{
		this.stock = new Stock();
		this.acct = new BankAccount();
		
		stock.loadStock();
		acct.initializeAccount();
	}
	
	public void browseItems() {/*...*/}
	
	public void placeOrder(final Item item, final int qty)
	{
		final boolean isAvailable = stock.checkIfAvailable(item, qty);
		if (isAvailable)
		{
			stock.removeItem(item, qty);
		}
		else
		{
			System.out.println("Stock doesnt have the mentioned quantity of items");
			return;
		}

		Double totalAmount = item.getPrice() * qty;
		
		try
		{
			acct.deductAmount(totalAmount);
			System.out.println("Order successfully placed...");
		}
		catch (Exception e)
		{
			e.getMessage();
			System.out.println("Order not successfully placed...");
		}
	}
}
