package org.test.dp.behavioral.observer.model;

public interface Subject
{
    void register(final Observer observer);
    void unregister(final Observer observer);
    
    void notifyObservers();
    
    Object getUpdate(final Observer observer);
    Boolean getState();
    
    default void postMessage(final String msg)
    {
        throw new RuntimeException("postMessage should be overridden");
    }
    
    static void checkNotNull(final Observer observer)
    {
        if (observer == null) throw new RuntimeException();
    }
}
