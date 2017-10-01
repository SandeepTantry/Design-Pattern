package org.test.dp.behavioral.mediator.model;

public class Eithad implements Flight
{
    private AirTrafficController controller;

    public Eithad(final AirTrafficController controller)
    {
        this.controller = controller;
    }

    @Override
    public String name()
    {
        return "Eithad";
    }
    
    @Override
    public void send(final String message)
    {
        controller.sendMessage(this, message);
    }
}
