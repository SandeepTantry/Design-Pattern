package org.test.dp.creational.singleton.model;

/**
 * The below reduces the performance because of cost associated with the synchronized method,
 * although we need it only for the first few threads who might create the separate instances
 */

public class SynchronizedSingleton
{
    private static SynchronizedSingleton instance;
    
    private SynchronizedSingleton() {}
    
    public static synchronized SynchronizedSingleton getInstance()
    {
        System.out.println(Thread.currentThread().getName());
        if (instance == null)
        {
            System.out.println(Thread.currentThread().getName());
            instance = new SynchronizedSingleton();
        }
        
        return instance;
    }
}
