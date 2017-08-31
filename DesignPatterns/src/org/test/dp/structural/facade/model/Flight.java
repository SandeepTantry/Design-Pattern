package org.test.dp.structural.facade.model;

import java.util.Map;

public class Flight
{
	private String name;
	private String src;
	private String dest;
	private Map<String, Double> priceRange;
	
	private Flight(final Flight prototype)
	{
		if (prototype != null)
		{
			this.name = prototype.name;
			this.src = prototype.src;
			this.dest = prototype.dest;
			this.priceRange = prototype.priceRange;
		}
	}
	
	private Flight(final String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public String getSrc()
	{
		return src;
	}

	public String getDest()
	{
		return dest;
	}

	public Map<String, Double> getPriceRange()
	{
		return priceRange;
	}
	
	@Override
	public String toString()
	{
		return "Flight [name=" + name + ", src=" + src + ", dest=" + dest + ", priceRange=" + priceRange + "]";
	}	
	
	// -------------

	public static FlightBuilder buildFlight(final String name)
	{
		return new FlightBuilder(name);
	}
	
	public static class FlightBuilder
	{
		private Flight prototype;
		
		private FlightBuilder(final Flight prototype)
		{
			this.prototype = (prototype != null) ? new Flight(prototype) : new Flight((Flight) null);
		}
		
		private FlightBuilder(final String name)
		{
			this.prototype = new Flight(name);
		}
		
		public FlightBuilder name(final String name)
		{
			prototype.name = name;
			return this;
		}
		
		public FlightBuilder src(final String src)
		{
			prototype.src = src;
			return this;
		}
		
		public FlightBuilder dest(final String dest)
		{
			prototype.dest = dest;
			return this;
		}
		
		public FlightBuilder priceRange(final Map<String, Double> priceRange)
		{
			prototype.priceRange = priceRange;
			return this;
		}
		
		public Flight build()
		{
			return new Flight(prototype);
		}
	}
}
