/**
 * We should avoid the instantiation until unless client calls the method.
 * Also this method doesn’t provide any options for exception handling
 */
package org.test.dp.creational.singleton.model;

public class EagerInitializedSingleton
{
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    
    private EagerInitializedSingleton() {}
    
    public static EagerInitializedSingleton getInstance()
    {
        return INSTANCE;
    }
}
