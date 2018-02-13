package org.test.dp.behavioral.mediator.model;

public interface Flight
{
    String name();
    void send(final String message);
    
    default void receive(final String message)
    {
        System.out.println(name() + " receieved the message - " + message);
    }
}
