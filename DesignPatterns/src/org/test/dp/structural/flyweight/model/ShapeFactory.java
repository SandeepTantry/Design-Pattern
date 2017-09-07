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
 * 
 * In our example, the client code is not forced to create object using Flyweight factory but we can force that to make sure client code uses flyweight pattern implementation but its a complete design decision for particular application.
 * Flyweight pattern introduces complexity and if number of shared objects are huge then there is a trade of between memory and time, so we need to use it judiciously based on our requirements.
 * Flyweight pattern implementation is not useful when the number of intrinsic properties of Object is huge, making implementation of Factory class complex.
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
