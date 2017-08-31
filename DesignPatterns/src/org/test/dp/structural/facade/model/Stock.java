package org.test.dp.structural.facade.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Stock
{
	Map<String, List<Item>> stockItems;
	
	public void fillStockItems(Map<String, List<Item>> stockItems)
	{
		this.stockItems = stockItems;
	}
	
	public List<Item> getItems(String type)
	{
		return stockItems.get(type);
	}
	
	public boolean checkIfAvailable(Item item, int qty)
	{
		List<Item> items = getItems(item.getType());
		if (items == null) return false;
		if (items.size() < 1) return false;
		if (qty > items.size()) return false;
		else return true;
	}
	
	public void removeItem(Item item, int qty)
	{
		/*Iterator<Entry<String, List<Item>>> iterator = stockItems.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<String, List<Item>> entry = iterator.next();
			if (entry.getKey().equals(item.getType()))
			{
				List<Item> items = new ArrayList<>(entry.getValue());
				//List<Item> items = entry.getValue();
				for (int i=0; i < qty; i++) items.remove(item);
				entry.setValue(items);
			}
		}*/
		
		for (Entry<String, List<Item>> entry : stockItems.entrySet())
		{
			if (entry.getKey().equals(item.getType()))
			{
				List<Item> items = new ArrayList<>(entry.getValue());
				for (int i = 0; i < qty; i++) items.remove(item);
				entry.setValue(items);
			}
		}
	}
	
	public void loadStock()
	{
		stockItems = new HashMap<>();
		
		Item paste1 = Item.buildItem("paste").id(123456L).name("Colgate").price(20D).build();
		Item paste2 = Item.buildItem("paste").id(123457L).name("Colgate").price(20D).build();
		Item paste3 = Item.buildItem("paste").id(123458L).name("Colgate").price(20D).build();
		Item brush1 = Item.buildItem("brush").id(123459L).name("Sensodent").price(30D).build();
		Item brush2 = Item.buildItem("brush").id(123460L).name("Sensodent").price(30D).build();
		Item brush3 = Item.buildItem("brush").id(123461L).name("Sensodent").price(30D).build();
		
		// Arrays.asList returns an fixed sized array, which can't be modified.
		List<Item> pastes = Arrays.asList(paste1, paste2, paste3);
		List<Item> brushes = Arrays.asList(brush1, brush2, brush3);
		
		stockItems.put("paste", pastes);
		stockItems.put("brush", brushes);
	}
}
