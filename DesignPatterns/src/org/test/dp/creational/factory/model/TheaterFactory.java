package org.test.dp.creational.factory.model;

public final class TheaterFactory
{
    private TheaterFactory() {}
    
    private static class TheaterFactoryHelper
    {
        private static final TheaterFactory INSTANCE = new TheaterFactory();
    }

    public static TheaterFactory getInstance()
    {
        return TheaterFactoryHelper.INSTANCE;
    }
    
    public Theater getTheater(final String type)
    {
        switch (type) {
            case "normal" : return new NormalTheater();
            case "3d" : return new ThreeDTheater();
            case "multi" : return new MultiScreenTheater();
        }
        
        // indicating that one of the 
        throw new RuntimeException("There is no implementation of the given type...");
    }
}
