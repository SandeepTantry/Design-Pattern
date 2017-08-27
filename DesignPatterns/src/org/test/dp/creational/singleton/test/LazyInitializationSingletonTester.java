package org.test.dp.creational.singleton.test;

import static org.test.dp.creational.singleton.model.LazyInitializationSingleton.getInstance;

import org.test.dp.creational.singleton.model.LazyInitializationSingleton;

public class LazyInitializationSingletonTester
{
    public static void main(String[] args)
    {
        LazyInitializationSingleton instance1 = getInstance();
        LazyInitializationSingleton instance2 = getInstance();
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        
        // below will break Singleton
        /*Runnable r = new RunnableInstance();
        Thread t1 = new Thread(r, "first thread");
        Thread t2 = new Thread(r, "second thread");
        
        t1.start();
        t2.start();*/
    }
    
    @SuppressWarnings("unused")
    private static class RunnableInstance implements Runnable
    {
        @Override
        public void run()
        {
            LazyInitializationSingleton instance= getInstance();
            System.out.println(instance.hashCode());
        }
    }
}
