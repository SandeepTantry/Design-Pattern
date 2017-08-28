package org.test.dp.creational.prototype.test;

import org.test.dp.creational.prototype.model.Address;

public class AddressTester
{
    public static void main(String[] args)
    {
        Address address = Address.defaultAddr()
                        .doorNo("201")
                        .houseName("ABC")
                        .streetNo("1st main")
                        .areaName("HSR")
                        .city("B'lore")
                        .state("Karnataka")
                        .pincode(560070)
                        .build();

        Address address2 = Address.fromAddr(address).build();

        System.out.println(address);
        System.out.println(address2);
        
        System.out.println("\n2 obj pointing to same memory -- " + (address == address2));
        System.out.println("2 obj having same property values -- " + (address.equals(address2)));
    }
}
