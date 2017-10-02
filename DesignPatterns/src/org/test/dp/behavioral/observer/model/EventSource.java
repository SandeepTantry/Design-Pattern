package org.test.dp.behavioral.observer.model;

import java.util.Observable;
import java.util.Scanner;

public class EventSource extends Observable implements Runnable
{
    @Override
    public void run()
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            String msg = null;
            while (!"STOP".equals(msg = scanner.next()))
            {
                setChanged();
                notifyObservers(msg);
            }
        }
    }
    
    @Override
    public String toString()
    {
        return "EventSource";
    }
}
