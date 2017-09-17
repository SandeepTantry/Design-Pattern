package org.test.dp.behavioral.command.model;

public class BuyStock implements Order
{
    public Stock stock;
    
    public BuyStock(final Stock stock)
    {
        this.stock = stock;
    }
    
    @Override
    public void execute()
    {
        stock.buy();
    }
}
