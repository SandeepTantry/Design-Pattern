package org.test.dp.creational.singleton.model;

/**
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory
 * and only when someone calls the getInstance method, this class gets loaded
 * and creates the Singleton class instance.
 * Doesn't need synchronization too, as there will be one instance of the actual class
 * loaded in memory ( initialized inside Helper class )
 */

public class BillPughSingleton
{
    private BillPughSingleton() {}
    
    // while compiling, this is created as separate class,
    // so only when this is loaded the instance will be created,
    // which will be through getInstance() method only.
    private static class BillPughSingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance()
    {
        System.out.println(Thread.currentThread().getName());
        return BillPughSingletonHelper.INSTANCE;
    }
}
