package org.test.dp.creational.prototype.test;

import java.util.List;

import org.test.dp.creational.prototype.model.PrototypeModel;

public class PrototypeModelTester
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        PrototypeModel model = new PrototypeModel();
        model.loadData();
        
        // with cloning
        List<String> temp1 = ((PrototypeModel) model.clone()).getSomeList();
        temp1.add("Howdy");
        List<String> temp2 = ((PrototypeModel) model.clone()).getSomeList();
        temp2.add("Wassup");
        
        System.out.println(temp1);
        System.out.println(temp2);
        
        // without cloning
        temp1 = model.getSomeList();
        temp1.add("Howdy");
        System.out.println(temp1);
        temp2 = model.getSomeList();
        temp2.add("Wassup");
        
        System.out.println(temp1);
        System.out.println(temp2);
        
        model.addToList("someValue");
        
        System.out.println(temp1);
        System.out.println(temp2);
    }
}
