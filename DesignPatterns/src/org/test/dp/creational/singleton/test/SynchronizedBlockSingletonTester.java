package org.test.dp.creational.singleton.test;

import static org.test.dp.creational.singleton.model.SynchronizedBlockSingleton.getInstance;

import org.test.dp.creational.singleton.model.SynchronizedBlockSingleton;

public class SynchronizedBlockSingletonTester
{
    public static void main(String[] args)
    {
        Runnable r = new RunnableInstance();
        
        Thread t1 = new Thread(r, "First Thread");
        Thread t2 = new Thread(r, "Second Thread");
        
        t1.start();
        t2.start();
    }
    
    private static class RunnableInstance implements Runnable
    {
        @Override
        public void run()
        {
            SynchronizedBlockSingleton instance = getInstance();
            System.out.println(instance.hashCode());
        }
    }
}
