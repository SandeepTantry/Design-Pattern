package org.test.dp.behavioral.visitor.model;

public class Fruit implements ItemElement
{
    private static int TAX = 10;
    private String name;
    private float weight;
    private float price;
    
    public Fruit(final String name, final float weight, final float price)
    {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public static int getTax()
    {
        return TAX;
    }
    
    public String name()
    {
        return name;
    }
    
    public float getWeight()
    {
        return weight;
    }

    @Override
    public float getPrice()
    {
        return price;
    }
    
    @Override
    public float accept(final ShoppingCartVisitor v)
    {
        return v.visit(this);
    }
}
