package org.test.dp.structural.adapter.model;

public class RectangleAdapter implements Square
{
    private Rectangle rectangle;
    
    public RectangleAdapter(final Rectangle rectangle)
    {
        this.rectangle = rectangle;
    }

    @Override
    public Double calculateArea(Double... values)
    {
        return rectangle.calculateArea(values);
    }

    @Override
    public Double calculateArea(Double side)
    {
        return rectangle.calculateArea(side, side);
    }
}
