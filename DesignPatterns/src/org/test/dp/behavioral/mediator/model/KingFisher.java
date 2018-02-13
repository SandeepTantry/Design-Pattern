package org.test.dp.behavioral.mediator.model;

@Deprecated
public class KingFisher implements Flight
{
    private AirTrafficController controller;
    
    public KingFisher(final AirTrafficController controller)
    {
        this.controller = controller;
    }

    @Override
    public String name()
    {
        return "KingFisher";
    }
    
    @Override
    public void send(final String message)
    {
        controller.sendMessage(this, message);
    }
}
