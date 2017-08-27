package org.test.dp.creational.singleton.test;

import static org.test.dp.creational.singleton.model.SerializedSingleton.getInstance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.test.dp.creational.singleton.model.SerializedSingleton;

public class SerializedSingletonTester
{
    public static void main(String[] args) throws FileNotFoundException,
        IOException, ClassNotFoundException
    {
        SerializedSingleton instance1 = getInstance();
        SerializedSingleton instance2;
        
        try (ObjectOutputStream outStream = new ObjectOutputStream(
                new FileOutputStream("./bin/SerializedObj.ser")))
        {
            outStream.writeObject(instance1);
        }
        
        try (ObjectInputStream inStream = new ObjectInputStream(
                new FileInputStream("./bin/SerializedObj.ser")))
        {
            instance2 = (SerializedSingleton) inStream.readObject();
        }
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
