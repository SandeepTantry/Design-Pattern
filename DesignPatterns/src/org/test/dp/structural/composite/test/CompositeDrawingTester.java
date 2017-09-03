package org.test.dp.structural.composite.test;

import org.test.dp.structural.composite.model.Circle;
import org.test.dp.structural.composite.model.GenericShape;
import org.test.dp.structural.composite.model.Triangle;

public class CompositeDrawingTester
{
    public static void main(String[] args)
    {
        final Triangle triangle = new Triangle("Triangle1");
        triangle.fill("Red");
        
        final Circle circle = new Circle("Circle1");
        circle.fill("Green");
        
        final GenericShape generic = new GenericShape();
        generic.add(triangle);
        generic.add(circle);
        generic.add(new Triangle("Triangle2"));
        generic.add(new Circle("Circle2"));
        generic.fill("Blue");
    }
}
