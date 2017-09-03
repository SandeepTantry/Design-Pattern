package org.test.dp.structural.flyweight.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Use sharing to support large numbers of fine-grained objects efficiently
 * to reuse already existing similar kind of objects by storing them
 * and create new object when no matching object is found
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance
 * 
 * eg. StringPool in java
 */

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
