package org.test.dp.behavioral.command.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Command pattern is a data driven design pattern. A request is wrapped under an object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.
 * 
 * 1. Command - Order, 2. Request - Stock 3. Invoker - Broker
 */

public class Broker
{
    public List<Order> orders = new ArrayList<>();
    
    public void takeOrder(final Order order)
    {
        orders.add(order);
    }
    
    public void placeOrders()
    {
        for (final Order order : orders)
        {
            order.execute();
        }
    }
}
