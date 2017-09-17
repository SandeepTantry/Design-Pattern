package org.test.dp.behavioral.command.test;

import org.test.dp.behavioral.command.model.BuyStock;
import org.test.dp.behavioral.command.model.SellStock;
import org.test.dp.behavioral.command.model.Stock;

import static org.test.dp.behavioral.command.model.Stock.TYPE.BOOKS;
import static org.test.dp.behavioral.command.model.Stock.TYPE.OTHERS;

import org.test.dp.behavioral.command.model.Broker;

public class CommandPatternTester
{
    public static void main(String[] args)
    {
        final BuyStock buy = new BuyStock(new Stock(BOOKS, 10));
        final SellStock sell = new SellStock(new Stock(OTHERS, 15));
        
        final Broker broker = new Broker();
        broker.takeOrder(buy);
        broker.takeOrder(sell);
        
        broker.placeOrders();
    }
}
