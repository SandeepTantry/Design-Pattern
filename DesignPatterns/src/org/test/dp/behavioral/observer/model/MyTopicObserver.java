package org.test.dp.behavioral.observer.model;

public class MyTopicObserver implements Observer
{
    private String name;
    private Subject subject;
    
    public MyTopicObserver(final String name)
    {
        this.name = name;
    }
    
    @Override
    public String name()
    {
        return name;
    }
    
    @Override
    public void update()
    {
        String msg = (String) subject.getUpdate(this);
        Boolean state = subject.getState();
        if (state && msg != null)
        {
            System.out.println(name + " :: Consuming message:: " + msg);
        }
        else if(msg == null || !state)
        {
            System.out.println(name + " :: No new message");
        }
    }
    
    @Override
    public void setSubject(final Subject subject)
    {
        this.subject = subject;
    }
}
