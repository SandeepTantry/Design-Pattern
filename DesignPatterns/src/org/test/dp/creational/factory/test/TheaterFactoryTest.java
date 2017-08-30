package org.test.dp.creational.factory.test;

import org.test.dp.creational.factory.model.Theater;
import org.test.dp.creational.factory.model.TheaterFactory;

public class TheaterFactoryTest
{
    public static void main(String[] args)
    {
        final TheaterFactory factory = TheaterFactory.getInstance();

        Theater theater = factory.getTheater("multi");
        theater.display();
        
        theater = factory.getTheater("3d");
        theater.display();
        
        theater = factory.getTheater("normal");
        theater.display();

        // will throw exception since there is no proper implementation
        //theater = factory.getTheater("ulti");
        //theater.display();
    }
}
