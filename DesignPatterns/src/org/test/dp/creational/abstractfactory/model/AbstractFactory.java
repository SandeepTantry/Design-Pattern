package org.test.dp.creational.abstractfactory.model;

public abstract class AbstractFactory
{
    abstract public Loan getLoan(final String loan);
    abstract public Bank getBank(final String bank);
}
