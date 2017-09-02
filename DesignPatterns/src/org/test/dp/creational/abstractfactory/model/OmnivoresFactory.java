package org.test.dp.creational.abstractfactory.model;

public class OmnivoresFactory implements AnimalFactory
{
    @Override
    public Animal createAnimal(final String dwell)
    {
        Animal a = null;
        switch (dwell)
        {
            case "forest" : a = new Lion(); break;
            case "city" : a = new Dog(); break;
            case "village" : 
            default : throw new RuntimeException("No herbivores animal found in " + dwell);
        }
        return a;
    }
}
