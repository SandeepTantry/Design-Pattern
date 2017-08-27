package org.test.dp.creational.builder.test;

import org.test.dp.creational.builder.model.Burger;

public class BurgerMakerTest
{
    public static void main(String[] args)
    {
        Burger normal = new Burger.BurgerMaker("normal", "mirchi")
                        .build();
        System.out.println(normal);
        
        Burger full = new Burger.BurgerMaker("sweet", "aloo")
                     .cheese("one layer")
                     .veggie("veg slices")
                     .build();
        System.out.println(full);
    }
}
