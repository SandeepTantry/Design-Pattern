package org.test.dp.structural.composite.model;

public class Circle implements Shape
{
    private String name;
    
    public Circle(final String name)
    {
        this.name = name;
    }
    
    @Override
    public void fill(final String fillColor)
    {
        System.out.println("Filling " + getName() + " with " + fillColor);
    }
    
    @Override
    public String getName()
    {
        return name;
    }
}
