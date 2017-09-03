package org.test.dp.structural.flyweight.test;

import static java.lang.Math.random;

import org.test.dp.structural.flyweight.model.Circle;
import org.test.dp.structural.flyweight.model.ShapeFactory;

/**
 * Use sharing to support large numbers of fine-grained objects efficiently
 * to reuse already existing similar kind of objects by storing them
 * and create new object when no matching object is found
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance
 * 
 * eg. StringPool in java
 */

public class FlyweightTester
{
    private static final String COLORS[] = { "Red", "Green", "Blue", "White", "Black" };
    
    public static void main(String[] args)
    {
       for (int i = 0; i < 5; ++i) {
          Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
          circle.setX(getRandomX());
          circle.setY(getRandomY());
          circle.setRadius(100);
          circle.draw();
       }
    }

    private static String getRandomColor()
    {
       return COLORS[(int)(random()*COLORS.length)];
    }

    private static int getRandomX()
    {
       return (int)(random()*100 );
    }

    private static int getRandomY()
    {
       return (int)(random()*100);
    }
}
