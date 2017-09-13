package org.test.dp.behavioral.chainofresp.model;

public class Rupee500Dispenser implements DispenseChain
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
        if (cur.getAmount() >= 500)
        {
            int num = cur.getAmount() / 500;
            int remainder = cur.getAmount() % 500;
            System.out.println("Dispensing " + num + " 500 note");
            if (remainder !=0)
                this.nextChain.dispense(new Currency(remainder));
        }
        else
        {
            this.nextChain.dispense(cur);
        }
    }
}
