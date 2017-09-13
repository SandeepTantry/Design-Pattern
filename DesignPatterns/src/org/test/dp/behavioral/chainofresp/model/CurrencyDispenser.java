package org.test.dp.behavioral.chainofresp.model;

public class CurrencyDispenser
{
    private DispenseChain baseChain;
    
    public CurrencyDispenser()
    {
        this.baseChain = new Rupee2000Dispenser();
        final DispenseChain ru500 = new Rupee500Dispenser();
        final DispenseChain ru100 = new Rupee100Dispenser();
        final DispenseChain ru50 = new Rupee50Dispenser();
        final DispenseChain ru20 = new Rupee20Dispenser();
        final DispenseChain ru10 = new Rupee10Dispenser();
        
        baseChain.setNextChain(ru500);
        ru500.setNextChain(ru100);
        ru100.setNextChain(ru50);
        ru50.setNextChain(ru20);
        ru20.setNextChain(ru10);
    }
    
    public void dispenseAmount(final int amount)
    {
        baseChain.dispense(new Currency(amount));
    }
}
