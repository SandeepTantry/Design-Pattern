package org.test.dp.structural.facade.model;

public class Item
{
	private String name;
	private Long id;
	private Double price;
	private String type;
	
	private Item(Item prototype)
	{
		if (prototype != null)
		{
			this.name = prototype.name;
			this.id = prototype.id;
			this.price = prototype.price;
			this.type = prototype.type;
		}
	}
	
	private Item(String type)
	{
		this.type = type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public Double getPrice()
	{
		return price;
	}
	
	public String getType()
	{
		return type;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other instanceof Item)
		{
			Item item = (Item) other;
			return this.getName().equals(item.getName()) &&
				this.getType().equals(item.getType()) &&
				this.getPrice().equals(item.getPrice());
		}
		return false;
	}
	
	// -------------------
	
	public static ItemBuilder buildItem(String type)
	{
		return new ItemBuilder(type);
	}
	
	public static class ItemBuilder
	{
		private Item prototype;
		
		private ItemBuilder(String type)
		{
			this.prototype = new Item(type); 
		}
		
		public ItemBuilder name(String name)
		{
			prototype.name = name;
			return this;
		}
		
		public ItemBuilder id(Long id)
		{
			prototype.id = id;
			return this;
		}
		
		public ItemBuilder price(Double price)
		{
			prototype.price = price;
			return this;
		}
		
		public Item build()
		{
			return new Item(prototype);
		}
	}
}
