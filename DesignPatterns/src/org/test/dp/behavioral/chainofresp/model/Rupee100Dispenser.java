package org.test.dp.behavioral.chainofresp.model;

public class Rupee100Dispenser implements DispenseChain
{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(final DispenseChain nextChain)
    {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(final Currency cur)
    {
        if (cur.getAmount() >= 100)
        {
            int num = cur.getAmount() / 100;
            int remainder = cur.getAmount() % 100;
            System.out.println("Dispensing " + num + " 100 note");
            if (remainder !=0)
                this.nextChain.dispense(new Currency(remainder));
        }
        else
        {
            this.nextChain.dispense(cur);
        }
    }
}
