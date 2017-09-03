package org.test.dp.structural.composite.model;

public class Triangle implements Shape
{
    private String name;

    public Triangle(final String name)
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
