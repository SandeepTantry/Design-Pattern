package org.test.dp.behavioral.visitor.model;

public interface ShoppingCartVisitor
{
    float visit(final Fruit f);
    float visit(final Book b);
}
