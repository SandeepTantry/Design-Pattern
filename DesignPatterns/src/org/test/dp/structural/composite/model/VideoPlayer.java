package org.test.dp.structural.composite.model;

public class VideoPlayer implements Application
{
    @Override
    public void close()
    {
        System.out.println("Closing VideoPlayer...");
    }
}
