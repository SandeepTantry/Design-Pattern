package org.test.dp.creational.abstractfactory.model;

public class BankFactory extends AbstractFactory
{
    @Override
    public Loan getLoan(String loan)
    {
        return null;
    }

    @Override
    public Bank getBank(String bank)
    {
        Bank b = null;
        switch (bank)
        {
            case "hdfc" : b = new HDFCBank(); break;
            case "syndicate" : b = new SyndicateBank(); break;
            case "sbi" : b = new SBIBank(); break;
            default : throw new RuntimeException("Unable to get mentioned bank " + bank);
        }
        return b;
    }
}
