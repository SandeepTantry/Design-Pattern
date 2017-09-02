package org.test.dp.creational.abstractfactory.model;

public class HerbivoresFactory implements AnimalFactory
{
    @Override
    public Animal createAnimal(final String dwell)
    {
        Animal a = null;
        switch (dwell)
        {
            case "forest" : a = new Deer(); break;
            case "village" : a = new Cow(); break;
            case "city" : 
            default : throw new RuntimeException("No herbivores animal found in " + dwell);
        }
        return a;
    }
}
