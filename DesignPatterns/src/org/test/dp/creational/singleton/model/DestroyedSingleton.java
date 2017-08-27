package org.test.dp.creational.singleton.model;

public class DestroyedSingleton
{
    //private static final DestroyedSingleton INSTANCE = new DestroyedSingleton();
    
    private static String someDummy;
    
    private DestroyedSingleton()
    {
        if (someDummy == null)
        {
            someDummy = "some value stored";
        }
        else
        {
            throw new RuntimeException();
        }
        
        /*if (INSTANCE != null)
        {
            throw new RuntimeException();
        }*/
    }
    
    private static class DestroyedSingletonHelper
    {
        private static final DestroyedSingleton INSTANCE = new DestroyedSingleton();
    }
    
    public static DestroyedSingleton getInstance()
    {
        return DestroyedSingletonHelper.INSTANCE;
    }
    
    /*public static DestroyedSingleton getInstance()
    {
        return INSTANCE;
    }*/
}
