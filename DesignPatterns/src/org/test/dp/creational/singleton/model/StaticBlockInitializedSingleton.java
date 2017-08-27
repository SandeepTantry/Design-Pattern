/**
 * Static Block initialization is similar to Eager, except it takes care of
 * any exception handling and can perform anything inside the block... 
 */
package org.test.dp.creational.singleton.model;

public class StaticBlockInitializedSingleton
{
    private static StaticBlockInitializedSingleton instance;
    
    static
    {
        try
        {
            instance = new StaticBlockInitializedSingleton();
        }
        catch (Exception e)
        {
            System.out.println("Some Exception thrown");
        }
    }
    
    private StaticBlockInitializedSingleton() { /*throw new RuntimeException();*/ }
    
    public static StaticBlockInitializedSingleton getInstance()
    {
        return instance;
    }
}
