package org.test.dp.creational.singleton.test;

import static org.test.dp.creational.singleton.model.StaticBlockInitializedSingleton.getInstance;

import org.test.dp.creational.singleton.model.StaticBlockInitializedSingleton;

public class StaticBlockInitializedSingletonTester
{
    public static void main(String[] args)
    {
        StaticBlockInitializedSingleton instance1 = getInstance();
        StaticBlockInitializedSingleton instance2 = getInstance();
        
        System.out.println("hashCode --> " + instance1.hashCode());
        System.out.println("hashCode --> " + instance2.hashCode());
    }
}
