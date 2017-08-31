package org.test.dp.structural.facade.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightBooker
{
	private List<Flight> allFlights;

	public FlightBooker()
	{
		loadFlights();
    }

	public List<Flight> getFlightsFor(final Date from, final Date to)
	{
		// process & return list;
		return Arrays.asList(allFlights.get(0));
	}
	
	private void loadFlights()
	{
		allFlights = new ArrayList<>();
		
		Map<String, Double> priceRange = new HashMap<>();
		priceRange.put("firstClass", 5000D);
		priceRange.put("economicClass", 3000D);
		Flight flight1 = Flight.buildFlight("Eithad").src("B'lore").dest("Dubai").priceRange(priceRange).build();
		
		allFlights.add(flight1);
	}
}