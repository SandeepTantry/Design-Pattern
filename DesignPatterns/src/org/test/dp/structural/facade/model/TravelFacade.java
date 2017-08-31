package org.test.dp.structural.facade.model;

import java.util.Date;
import java.util.List;

public class TravelFacade
{
	private HotelBooker hotelBooker;
	private FlightBooker flightBooker;
	
	public TravelFacade()
	{
		this.hotelBooker = new HotelBooker();
		this.flightBooker = new FlightBooker();
	}
	
	public void getFlightsAndHotels(final Date from, final Date to)
	{
		List<Flight> flights = flightBooker.getFlightsFor(from, to);
		List<Hotel> hotels = hotelBooker.getHotelsFor(from, to);
		//process and return
		
		System.out.println("Flights available --> " + flights);
		System.out.println("Hotels available --> " + hotels);
	}
}
