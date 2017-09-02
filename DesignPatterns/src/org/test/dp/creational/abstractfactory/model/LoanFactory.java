package org.test.dp.creational.abstractfactory.model;

public class LoanFactory extends AbstractFactory
{
    @Override
    public Loan getLoan(String loan)
    {
        Loan l = null;
        switch (loan)
        {
            case "home" : l = new HomeLoan(10.5); break;
            case "educational" : l = new EducationLoan(8.5); break;
            case "personal" : l = new PersonalLoan(12.5); break;
            default : throw new RuntimeException("Unable to get mentioned loan " + loan);
        }
        return l;
    }

    @Override
    public Bank getBank(String bank)
    {
        return null;
    }
}
