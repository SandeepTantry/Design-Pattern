package org.test.dp.behavioral.command.model;

/**
 * Problem: Need to issue requests to objects without knowing anything about the operation being requested
 * or the receiver of the request.
 * 
 * Command object passes the request to the appropriate method of Receiver to perform the specific action.
 * The client program create the receiver object and then attach it to the Command.
 * Then it creates the invoker object and attach the command object to perform an action.
 * Now when client program executes the action, it’s processed based on the command and receiver object
 * 
 * Command design pattern is used to implement loose coupling in a request-response model.
 * 
 */

// Broker class
public class FileSystemReceiverUtil
{
    public static FileSystemReceiver getFileSystem()
    {
        return null;
    }
}
