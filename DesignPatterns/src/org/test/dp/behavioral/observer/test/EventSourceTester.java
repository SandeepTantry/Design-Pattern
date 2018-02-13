package org.test.dp.behavioral.observer.test;

import java.util.Observable;
import java.util.Observer;

import org.test.dp.behavioral.observer.model.EventSource;

public class EventSourceTester
{
    private static int count = 0;

    public static void main(String[] args)
    {
        System.out.println("Enter message\n");
        EventSource source = new EventSource();
        source.addObserver(getObserver());
        source.addObserver(getObserver());
        source.addObserver(getObserver());
        source.addObserver(getObserver());
        
        new Thread(source).start();
    }
    
    /*private static Observer getObserver()
    {
        return (a, b) -> {
            System.out.println("Receiver " + (++count) + " received response :: " + b + ", from source :: " + a.toString());
        };
    }*/
    
    private static Observer getObserver()
    {
        return new Observer() {
            @Override
            public void update(final Observable o, final Object arg)
            {
                System.out.println("Receiver " + (++count) + " received response :: " + arg + ", from source :: " + o.toString());
            }
        };
    }
}
