package org.test.dp.creational.singleton.test;

import static org.test.dp.creational.singleton.model.DestroyedSingleton.getInstance;

import java.lang.reflect.Constructor;

import org.test.dp.creational.singleton.model.DestroyedSingleton;

public class DestroyedSingletonTester
{
    public static void main(String[] args)
    {
        DestroyedSingleton instance1 = getInstance();
        DestroyedSingleton instance2 = null;
        
        try
        {
            Constructor<?>[] constructors = DestroyedSingleton.class.getDeclaredConstructors();
            
            for (Constructor<?> c : constructors)
            {
                c.setAccessible(true);
                instance2 = (DestroyedSingleton) c.newInstance();
                break;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2 != null ? instance2.hashCode() : "Second instance not created");
    }
}
