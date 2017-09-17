package org.test.dp.behavioral.command.model;

public class UnixFileSystemReceiver implements FileSystemReceiver
{
    private static final String OS = "UNIX";

    @Override
    public void open()
    {
        System.out.println("Opening file in " + OS);
    }

    @Override
    public void write()
    {
        System.out.println("Writing file in " + OS);
    }

    @Override
    public void close()
    {
        System.out.println("Closing file in " + OS);
    }
}
