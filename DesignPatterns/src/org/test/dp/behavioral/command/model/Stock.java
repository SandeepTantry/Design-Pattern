package org.test.dp.behavioral.command.model;

public class Stock
{
    private TYPE type;
    private int qty;
    
    public Stock(final TYPE type, final int qty)
    {
        this.type = type;
        this.qty = qty;
    }
    
    public void buy()
    {
        System.out.println("Buying " + qty + " amount of " + type);
    }
    
    public void sell()
    {
        System.out.println("Selling " + qty + " amount of " + type);
    }
    
    public enum TYPE
    {
        BOOKS, PENS, PENCILS, OTHERS
    }
}
