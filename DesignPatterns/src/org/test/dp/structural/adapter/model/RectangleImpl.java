package org.test.dp.structural.adapter.model;

public class RectangleImpl implements Rectangle
{
    @Override
    public Double calculateArea(final Double... values)
    {
        return calculateArea(values[0], values[1]);
    }

    @Override
    public Double calculateArea(final Double length, final Double width)
    {
        return length * width;
    }
}
