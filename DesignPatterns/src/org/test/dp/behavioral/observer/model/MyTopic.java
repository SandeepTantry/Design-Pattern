package org.test.dp.behavioral.observer.model;

import static org.test.dp.behavioral.observer.model.Subject.checkNotNull;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyTopic implements Subject
{
    private String msg;
    private boolean state;
    private Set<Observer> observers = new LinkedHashSet<>();
    private final Object MUTEX = new Object();
    
    @Override
    public void register(final Observer observer)
    {
        checkNotNull(observer);
        synchronized (MUTEX)
        {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(final Observer observer)
    {
        checkNotNull(observer);
        synchronized (MUTEX)
        {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers()
    {
        List<Observer> temp = new ArrayList<>();
        synchronized (MUTEX)
        {
            if (!state)
            {
                System.out.println("No new message to post");
                return;
            }
            
            temp.addAll(observers);
            temp.forEach(Observer::update);
            state = false;
        }
    }

    @Override
    public Object getUpdate(final Observer observer)
    {
        return msg;
    }
    
    @Override
    public Boolean getState()
    {
        return state;
    }
    
    @Override
    public void postMessage(final String msg){
        System.out.println("Message Posted to Topic: " + msg);
        this.msg = msg;
        this.state = true;
        notifyObservers();
    }
}
