package org.test.dp.structural.composite.model;

public class Game implements Application
{
    @Override
    public void close()
    {
        System.out.println("Closing game...");
    }
}
