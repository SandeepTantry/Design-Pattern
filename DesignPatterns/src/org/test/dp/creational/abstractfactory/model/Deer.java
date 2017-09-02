package org.test.dp.creational.abstractfactory.model;

public class Deer implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("I am a deer and I eat grass in the " + dwell());
    }
    
    @Override
    public String dwell()
    {
        return "forest";
    }
}
