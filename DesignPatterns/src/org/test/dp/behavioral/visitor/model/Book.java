package org.test.dp.behavioral.visitor.model;

public class Book implements ItemElement
{
    private static int TAX = 12;
    private String isbn;
    private float price;
    private int qty;
    
    public Book(final String isbn, final float price, final int qty)
    {
        this.isbn = isbn;
        this.price = price;
        this.qty = qty;
    }
    
    public static int getTax()
    {
        return TAX;
    }
    
    public String getIsbn()
    {
        return isbn;
    }

    @Override
    public float getPrice()
    {
        return price;
    }
    
    public int getQty()
    {
        return qty;
    }
    
    @Override
    public float accept(final ShoppingCartVisitor v)
    {
        return v.visit(this);
    }
}
