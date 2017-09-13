package org.test.dp.behavioral.chainofresp.model;

public interface DispenseChain
{
    void setNextChain(final DispenseChain nextChain);
    void dispense(final Currency cur);
}
