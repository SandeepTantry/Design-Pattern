package org.test.dp.structural.facade.test;

import org.test.dp.structural.facade.model.FacadeSystem;
import org.test.dp.structural.facade.model.Item;

public class FacadeSystemTester
{
	public static void main(String[] args)
	{
		FacadeSystem system = new FacadeSystem();
		
		// browse items
		system.browseItems();
		// select items and qty
		//Item item = Item.buildItem("paste").id(123456L).name("Colgate").price(20D).build();
		Item item = Item.buildItem("brush").id(123459L).name("Sensodent").price(30D).build();
		int qty = 1;
		// place order
		system.placeOrder(item, qty);
		
		system.placeOrder(item, 3);
		
		//System.out.println(((float)25/100)*10);
		//System.out.println(Arrays.asList(new String[] {"a", "b", "c"}));
	}
}
