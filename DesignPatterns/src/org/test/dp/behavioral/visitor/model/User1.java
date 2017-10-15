package org.test.dp.behavioral.visitor.model;

public class User1 implements Traveller
{
    private String name;
    
    public User1(final String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    @Override
    public void travel(final Ola o)
    {
        System.out.println("Travelling in Ola. Details are below :");
        System.out.println(o.getDetails());
    }
    
    @Override
    public void travel(final Uber u)
    {
        System.out.println("Travelling in Uber. Details are below :");
        System.out.println(u.getDetails());
    }
    
    @Override
    public void travel(final Meru m)
    {
        System.out.println("Travelling in Meru. Details are below :");
        System.out.println(m.getDetails());
    }
}
