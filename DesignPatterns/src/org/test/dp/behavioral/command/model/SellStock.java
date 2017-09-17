package org.test.dp.behavioral.command.model;

public class SellStock implements Order
{
    public Stock stock;
    
    public SellStock(final Stock stock)
    {
        this.stock = stock;
    }
    
    @Override
    public void execute()
    {
        stock.sell();
    }
}
