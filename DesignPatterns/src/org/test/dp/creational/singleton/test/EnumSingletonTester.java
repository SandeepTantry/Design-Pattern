package org.test.dp.creational.singleton.test;

import org.test.dp.creational.singleton.model.EnumSingleton;

public class EnumSingletonTester
{
    public static void main(String[] args)
    {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
