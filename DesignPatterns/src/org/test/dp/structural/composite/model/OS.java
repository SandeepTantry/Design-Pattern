package org.test.dp.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object.
 * Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy
 * 
 * allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects
 * 
 * 3 things : 1. Component 2. Leaf(s) 3. Composite
 * eg: java.awt.Container
 */

public class OS implements Application
{
    private List<Application> apps;
    
    public void add(final Application app)
    {
        if (apps == null)
        {
            apps = new ArrayList<Application>();
        }
        apps.add(app);
    }
    
    @Override
    public void close()
    {
        for (Application app : apps)
        {
            app.close();
        }
        System.out.println("Shutting down the system...");
    }
}
