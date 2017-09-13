package org.test.dp.behavioral.chainofresp.model;

public class Rupee50Dispenser implements DispenseChain
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
        if (cur.getAmount() >= 50)
        {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50 note");
            if (remainder !=0)
                this.nextChain.dispense(new Currency(remainder));
        }
        else
        {
            this.nextChain.dispense(cur);
        }
    }
}
