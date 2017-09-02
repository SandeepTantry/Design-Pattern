package org.test.dp.creational.abstractfactory.model;

public class Lion implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("I am a lion and i eat flesh in the " + dwell());
    }
    
    @Override
    public String dwell()
    {
        return "forest";
    }
}
