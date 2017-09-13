package org.test.dp.behavioral.chainofresp.model;

public class Rupee20Dispenser implements DispenseChain
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
        if (cur.getAmount() >= 20)
        {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20 note");
            if (remainder !=0)
                this.nextChain.dispense(new Currency(remainder));
        }
        else
        {
            this.nextChain.dispense(cur);
        }
    }
}
