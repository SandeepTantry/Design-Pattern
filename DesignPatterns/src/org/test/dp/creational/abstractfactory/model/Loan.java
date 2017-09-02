package org.test.dp.creational.abstractfactory.model;

import static java.lang.Math.pow;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Loan
{
    private Double rate;
    
    protected Loan(final Double rate)
    {
        this.rate = rate;
    }
    
    public void calculateLoanPayment(final Double loanAmount, final int years)
    {
        rate = rate/1200;
        int n = years*12;
        double EMI = ((rate * pow((1+rate), n)) / ((pow((1+rate),n))-1)) * loanAmount;

        //final String message = String.format("your monthly EMI is \u20B9%.2f for the amount \u20B9%.2f you have borrowed", EMI, loanAmount);
        NumberFormat instance = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        //instance.setCurrency(Currency.getInstance("\u20B9"));
        final String message = "your monthly EMI is " + instance.format(EMI) +
                        " for the amount " + instance.format(loanAmount) + " you have borrowed";
        System.out.println(message);
    }
}
