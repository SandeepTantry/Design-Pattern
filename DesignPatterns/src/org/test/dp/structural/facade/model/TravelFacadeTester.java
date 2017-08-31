package org.test.dp.structural.facade.model;

public class TravelFacadeTester
{
	public static void main(String[] args)
	{
		TravelFacade system = new TravelFacade();
		
		system.getFlightsAndHotels(null, null);
	}
}
