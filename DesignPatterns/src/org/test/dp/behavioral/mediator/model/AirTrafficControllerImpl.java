package org.test.dp.behavioral.mediator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator design pattern is used to provide a centralized communication medium between different objects in a system.
 * Promotes <b>many-to-many relationships</b> between interacting peers to "full object status".
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly,
 * and it lets you vary their interaction independently.
 * Define an object that encapsulates how a set of objects interact
 * Mediator works as a router between objects and it can have it’s own logic to provide way of communication.
 * 
 * eg. java.util.Timer - scheduleXXX() methods, java.lang.reflect.Method.invoke(), Air Traffic Controller
 */

public class AirTrafficControllerImpl implements AirTrafficController
{
    private List<Flight> flights = new ArrayList<>();

    @Override
    public void sendMessage(final Flight flight, final String message)
    {
        flights.stream()
            .filter(f -> f != flight)
            .forEach(f -> f.receive(message));
    }

    @Override
    public void registerFlight(final Flight flight)
    {
        flights.add(flight);
    }
}
