package org.test.dp.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class GenericShape implements Shape
{
    private List<Shape> shapes;
    
    public void add(final Shape shape)
    {
        if (shapes == null)
        {
            shapes = new ArrayList<Shape>();
        }
        shapes.add(shape);
    }
    
    @Override
    public void fill(final String fillColor)
    {
        for (Shape shape : shapes)
        {
            shape.fill(fillColor);
        }
    }
    
    @Override
    public String getName()
    {
        return "Generic";
    }
}
