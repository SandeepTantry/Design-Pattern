package org.test.dp.creational.singleton.model;

import java.io.Serializable;

/**
 * Sometimes in distributed systems, we need to implement Serializable interface in Singleton class
 * so that we can store it’s state in file system and retrieve it at later point of time
 * Inorder to save singleton pattern, we need to override readResolve() method 
 */

public class SerializedSingleton implements Serializable
{
    private static final long serialVersionUID = 1610315155304860739L;

    private SerializedSingleton() {}
    
    private static class SerializedSingletonHelper
    {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance()
    {
        return SerializedSingletonHelper.INSTANCE;
    }
    
    // this will make sure that same instance will be returned when deserialized
    public Object readResolve()
    {
        return getInstance();
    }
}
