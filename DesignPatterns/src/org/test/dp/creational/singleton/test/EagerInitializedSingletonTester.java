package org.test.dp.creational.singleton.test;

import static org.test.dp.creational.singleton.model.EagerInitializedSingleton.getInstance;

import org.test.dp.creational.singleton.model.EagerInitializedSingleton;

public class EagerInitializedSingletonTester
{
    public static void main(String[] args)
    {
        EagerInitializedSingleton instance1 = getInstance();
        EagerInitializedSingleton instance2 = getInstance();
        
        System.out.println("hashcode --> " + instance1.hashCode());
        System.out.println("hashcode --> " + instance2.hashCode());
    }
}
