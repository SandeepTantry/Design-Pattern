package org.test.dp.creational.abstractfactory.model;

public class Dog implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("I am a dog and i eat flesh in the " + dwell());
    }
    
    @Override
    public String dwell()
    {
        return "city";
    }
}
