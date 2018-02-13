package org.test.dp.behavioral.visitor.model;

public interface ItemElement
{
    float accept(final ShoppingCartVisitor v);
    float getPrice();
}
