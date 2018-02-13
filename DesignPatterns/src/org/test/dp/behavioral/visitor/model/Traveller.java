package org.test.dp.behavioral.visitor.model;

public interface Traveller
{
    void travel(final Ola o);
    void travel(final Uber u);
    void travel(final Meru m);
}
