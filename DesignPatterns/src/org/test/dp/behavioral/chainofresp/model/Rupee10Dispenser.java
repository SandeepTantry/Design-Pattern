package org.test.dp.behavioral.chainofresp.model;

public class Rupee10Dispenser implements DispenseChain
{
    @SuppressWarnings("unused")
    private DispenseChain nextChain;

    @Override
    public void setNextChain(final DispenseChain nextChain)
    {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(final Currency cur)
    {
        int num = cur.getAmount() / 10;
        System.out.println("Dispensing " + num + " 10 note");
    }
}
