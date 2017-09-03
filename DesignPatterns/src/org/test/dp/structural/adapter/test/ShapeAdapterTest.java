package org.test.dp.structural.adapter.test;

import org.test.dp.structural.adapter.model.Rectangle;
import org.test.dp.structural.adapter.model.RectangleAdapter;
import org.test.dp.structural.adapter.model.RectangleImpl;
import org.test.dp.structural.adapter.model.Square;
import org.test.dp.structural.adapter.model.SquareImpl;

public class ShapeAdapterTest
{
    public static void main(String[] args)
    {
        final Rectangle rect = new RectangleImpl();
        System.out.println(rect.calculateArea(10D, 20D));
        
        final Square sq = new SquareImpl();
        System.out.println(sq.calculateArea(20D));
        
        RectangleAdapter adapter = new RectangleAdapter(rect);
        System.out.println(adapter.calculateArea(30D));
    }
}
