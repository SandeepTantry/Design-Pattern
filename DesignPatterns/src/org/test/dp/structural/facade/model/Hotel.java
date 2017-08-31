package org.test.dp.structural.facade.model;

import java.util.Map;

public class Hotel
{
	private String name;
	private String address;
	private Map<String, Double> priceRange;
	
	private Hotel(final Hotel prototype)
	{
		if (prototype != null)
		{
			this.name = prototype.name;
			this.address = prototype.address;
			this.priceRange = prototype.priceRange;
		}
	}
	
	private Hotel(final String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public Map<String, Double> getPriceRange()
	{
		return priceRange;
	}
	
	@Override
	public String toString()
	{
		return "Hotel [name=" + name + ", address=" + address + ", priceRange=" + priceRange + "]";
	}
	
	// ------
	
	public static HotelBuilder buildHotel(final String name)
	{
		return new HotelBuilder(name);
	}
	
	public static class HotelBuilder
	{
		private Hotel prototype;
		
		private HotelBuilder(final Hotel prototype)
		{
			this.prototype = (prototype != null) ? new Hotel(prototype) : new Hotel((Hotel) null);
		}
		
		private HotelBuilder(final String name)
		{
			this.prototype = new Hotel(name);
		}
		
		public HotelBuilder name(final String name)
		{
			prototype.name = name;
			return this;
		}
		
		public HotelBuilder address(final String address)
		{
			prototype.address = address;
			return this;
		}
		
		public HotelBuilder priceRange(final Map<String, Double> priceRange)
		{
			prototype.priceRange = priceRange;
			return this;
		}
		
		public Hotel build()
		{
			return new Hotel(prototype);
		}
	}
}
