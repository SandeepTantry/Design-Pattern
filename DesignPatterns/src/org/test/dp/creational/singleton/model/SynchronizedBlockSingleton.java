package org.test.dp.creational.singleton.model;

/**
 * This slightly improves performance compared to previous approach.
 * Additional if() check is to ensure that only one instance of singleton class is created.
 * Prior to Java 1.5, below approach used to fail in certain scenarios
 * where too many threads try to get the instance of the Singleton class simultaneously.
 */

public class SynchronizedBlockSingleton
{
    private static SynchronizedBlockSingleton instance;
    
    private SynchronizedBlockSingleton() {}
    
    public static SynchronizedBlockSingleton getInstance()
    {
        System.out.println(Thread.currentThread().getName());
        if (instance == null)
        {
            synchronized (SynchronizedBlockSingleton.class)
            {
                // Double check
                if (instance == null)
                {
                    System.out.println(Thread.currentThread().getName());
                    instance = new SynchronizedBlockSingleton();
                }
            }
        }
        
        return instance;
    }
}
