package org.test.dp.creational.abstractfactory.model;

public class AnimalFactoryCreator
{
    public static Animal getAnimal(String type, String dwell)
    {
        Animal a = null;
        if ("herbivores".equalsIgnoreCase(type))
        {
            a = new HerbivoresFactory().createAnimal(dwell.toLowerCase());
        }
        else
        {
            a = new OmnivoresFactory().createAnimal(dwell.toLowerCase());
        }
        return a;
    }
}
