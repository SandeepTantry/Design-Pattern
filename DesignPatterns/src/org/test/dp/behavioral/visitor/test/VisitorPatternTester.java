package org.test.dp.behavioral.visitor.test;

import java.util.Arrays;
import java.util.List;

import org.test.dp.behavioral.visitor.model.Book;
import org.test.dp.behavioral.visitor.model.Fruit;
import org.test.dp.behavioral.visitor.model.ItemElement;
import org.test.dp.behavioral.visitor.model.ShoppingCartVisitorImpl;

public class VisitorPatternTester
{
    public static void main(String[] args)
    {
        final Book b1 = new Book("isbn1", 15f, 3);
        final Book b2 = new Book("isbn2", 20f, 2);
        
        final Fruit f1 = new Fruit("Chikku", 60f, 1);
        final Fruit f2 = new Fruit("Banana", 50f, 1.5f);
        
        final ShoppingCartVisitorImpl impl = new ShoppingCartVisitorImpl();
        final List<ItemElement> elements = Arrays.asList(b1, b2, f1, f2);

        float total = 0;
        for (final ItemElement e : elements)
        {
           total += e.accept(impl); 
        }
        System.out.println("Total order value = " + Math.round(total));
    }
}
