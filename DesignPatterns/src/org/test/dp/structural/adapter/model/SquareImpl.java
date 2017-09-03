package org.test.dp.structural.adapter.model;

import static java.lang.Math.pow;

public class SquareImpl implements Square
{
    @Override
    public Double calculateArea(final Double... values)
    {
        return calculateArea(values[0]);
    }

    @Override
    public Double calculateArea(final Double side)
    {
        return pow(side, 2);
    }
}
