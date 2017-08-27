package org.test.dp.creational.singleton.test;

import static org.test.dp.creational.singleton.model.BillPughSingleton.getInstance;

import org.test.dp.creational.singleton.model.BillPughSingleton;

public class BillPughSingletonTester
{
    public static void main(String[] args)
    {
        BillPughSingleton instance1 = getInstance();
        BillPughSingleton instance2 = getInstance();
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        
        /*Runnable r = new RunnableInstance();
        
        Thread t1 = new Thread(r, "First thread");
        Thread t2 = new Thread(r, "Second thread");
        
        t1.start();
        t2.start();*/
    }
    
    @SuppressWarnings("unused")
    private static class RunnableInstance implements Runnable
    {
        @Override
        public void run()
        {
            BillPughSingleton instance = getInstance();
            System.out.println(instance.hashCode());
        }
    }
}
