package org.test.dp.behavioral.mediator.model;

public class SpiceJet implements Flight
{
    private AirTrafficController controller;

    public SpiceJet(final AirTrafficController controller)
    {
        this.controller = controller;
    }

    @Override
    public String name()
    {
        return "SpiceJet";
    }
    
    @Override
    public void send(final String message)
    {
        controller.sendMessage(this, message);
    }
}
