package org.test.dp.behavioral.mediator.model;

public class AirIndia implements Flight
{
    private AirTrafficController controller;

    public AirIndia(final AirTrafficController controller)
    {
        this.controller = controller;
    }

    @Override
    public String name()
    {
        return "AirIndia";
    }
    
    @Override
    public void send(final String message)
    {
        controller.sendMessage(this, message);
    }
}
