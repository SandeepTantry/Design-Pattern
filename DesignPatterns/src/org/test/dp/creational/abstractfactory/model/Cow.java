package org.test.dp.creational.abstractfactory.model;

public class Cow implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("I am a cow and I eat grass in the " + dwell());
    }
    
    @Override
    public String dwell()
    {
        return "village";
    }
}