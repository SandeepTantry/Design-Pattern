package org.test.dp.creational.abstractfactory.model;

public class FactoryCreator
{
    public static AbstractFactory getFactory(final String choice)
    {
        if ("loan".equals(choice))
        {
            return new LoanFactory();
        }
        else if ("bank".equals(choice))
        {
            return new BankFactory();
        }
        else
        {
            return null;
        }
    }
}
