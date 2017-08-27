package org.test.dp.creational.singleton.model;

/**
 * works fine incase of single threaded environment
 * but when it comes to multithreaded systems, it might break singleton pattern
 */

public class LazyInitializationSingleton
{
    private static LazyInitializationSingleton instance;
    
    private LazyInitializationSingleton() {}
    
    public static LazyInitializationSingleton getInstance()
    {
        if (instance == null)
        {
            System.out.println(Thread.currentThread().getName());
            instance = new LazyInitializationSingleton();
        }
        
        return instance;
    }
}
