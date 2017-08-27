package org.test.dp.creational.prototype.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Sometimes we need to modify existing data several times in our program,
 * so it’s not a good idea to create the Object using new keyword and load all the data again
 * The better approach would be to clone the existing object into a new object and then do the manipulation.
 * 
 * NOTE : Prototype design pattern mandates that the Object which you are copying should provide the copying feature.
 * It should not be done by any other class. However whether to use shallow or deep copy of the Object properties,
 * depends on the requirements and its a design decision.
 */
public class PrototypeModel implements Cloneable
{
    private List<String> someList;
    
    public PrototypeModel()
    {
        someList = new ArrayList<>();
    }
    
    public PrototypeModel(final List<String> someList)
    {
        this.someList = someList;
    }

    public List<String> getSomeList()
    {
        return someList;
    }
    
    public void loadData()
    {
        someList.add("Hi");
        someList.add("Hello");
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        //return super.clone();
        
        List<String> list = new ArrayList<>();
        for (String s : someList)
        {
            list.add(s);
        }
        return new PrototypeModel(list);
    }
}
