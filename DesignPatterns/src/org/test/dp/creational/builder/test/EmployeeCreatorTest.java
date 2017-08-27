package org.test.dp.creational.builder.test;

import java.util.Arrays;

import org.test.dp.creational.builder.model.Employee;

public class EmployeeCreatorTest
{
    public static void main(String[] args)
    {
        Employee emp = Employee.basicEmployee("Sandeep", 6024965)
                        .build();
        System.out.println(emp);
        
        Employee emp2 = Employee.fromEmployee(emp)
                        .age(28)
                        .address1("BSK 3rd stage")
                        .address2("B'lore")
                        .salary(150000)
                        .dept("Legal")
                        .skillSet(Arrays.asList("Java", "JS", "Spring"))
                        .build();
        System.out.println(emp2);
    }
}
