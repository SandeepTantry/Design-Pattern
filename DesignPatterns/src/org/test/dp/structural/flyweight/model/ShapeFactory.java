package org.test.dp.structural.flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory
{
    private static final Map<String, Shape> SHAPES = new HashMap<>();
    
    public static Shape getCircle(final String color)
    {
        Circle circle = (Circle) SHAPES.get(color);
        
        if (circle == null)
        {
            circle = new Circle(color); // by default
            SHAPES.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        
        return circle;
    }
}
