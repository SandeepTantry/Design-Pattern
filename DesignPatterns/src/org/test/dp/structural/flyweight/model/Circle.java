package org.test.dp.structural.flyweight.model;

public class Circle implements Shape
{
    private String color;
    private int x;
    private int y;
    private int radius;
    
    public Circle(final String color)
    {
        this.color = color;
    }
    
    public void setX(final int x)
    {
        this.x = x;
    }
    
    public void setY(final int y)
    {
        this.y = y;
    }
    
    public void setRadius(final int radius)
    {
        this.radius = radius;
    }
    
    @Override
    public void draw()
    {
       System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius + "]");
    }
    
    @Override
    public boolean equals(Object o)
    {
    	if (o != null || !(o instanceof Circle)) return false;
    	Circle c = (Circle) o;
        return color.equals(c.color) && x == c.x && y == c.y; 
    }
}
