package org.test.dp.structural.facade.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelBooker
{
	private List<Hotel> allHotels;
	
	public HotelBooker()
	{
		loadHotels();
	}
	
	public List<Hotel> getHotelsFor(final Date from, final Date to)
	{
		// process & return list;
		return Arrays.asList(allHotels.get(0));
	}
	
	private void loadHotels()
	{
		allHotels = new ArrayList<>();
		
		Map<String, Double> priceRange = new HashMap<>();
		priceRange.put("oneBed", 500D);
		priceRange.put("twoBed", 800D);
		priceRange.put("AC", 900D);
		Hotel hotel1 = Hotel.buildHotel("Lodge").address("B'lore").priceRange(priceRange).build();
		
		allHotels.add(hotel1);
	}
}
