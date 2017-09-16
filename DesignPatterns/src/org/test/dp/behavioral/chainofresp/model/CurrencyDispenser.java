package org.test.dp.behavioral.chainofresp.model;

/**
 * Chain of responsibility pattern is used to achieve loose coupling where a request from client is passed to a chain of objects to process them.
 * Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
 * 
 * . Client doesn’t know which part of the chain will be processing the request and it will send the request to the first object in the chain.
 * . Each object in the chain will have it’s own implementation to process the request, either full or partial or to send it to the next object in the chain.
 * . Every object in the chain should have reference to the next object in chain to forward the request to, its achieved by java composition.
 * . Creating the chain carefully is very important otherwise there might be a case that the request will never be forwarded to a particular processor
 *   or there are no objects in the chain who are able to handle the request.\
 * . Chain of Responsibility design pattern is good to achieve lose coupling but it comes with the trade-off of having a lot of implementation classes
 *   and maintenance problems if most of the code is common in all the implementations.
 * 
 * eg. try/catch block, Logger.log() , Filter.doFilter()...
 */

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
