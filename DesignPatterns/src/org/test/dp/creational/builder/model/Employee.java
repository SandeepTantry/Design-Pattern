package org.test.dp.creational.builder.model;

import java.util.List;

public class Employee
{
    private String empName;
    private int empId;
    private int age;
    private String address1;
    private String address2;
    private Double salary;
    private String dept;
    private List<String> skillSet;
    
    private Employee(Employee prototype)
    {
        if (prototype != null)
        {
            this.empName = prototype.empName;
            this.empId = prototype.empId;
            this.age = prototype.age;
            this.address1 = prototype.address1;
            this.address2 = prototype.address2;
            this.salary = prototype.salary;
            this.dept = prototype.dept;
            this.skillSet = prototype.skillSet;
        }
    }
    
    public String getEmpName()
    {
        return empName;
    }

    public int getEmpId()
    {
        return empId;
    }

    public int getAge()
    {
        return age;
    }

    public String getAddress1()
    {
        return address1;
    }

    public String getAddress2()
    {
        return address2;
    }

    public Double getSalary()
    {
        return salary;
    }

    public String getDept()
    {
        return dept;
    }

    public List<String> getSkillSet()
    {
        return skillSet;
    }
    
    // Builder class
    public static class EmployeeBuilder
    {
        private Employee prototype;
        
        // required params.
        public EmployeeBuilder(final String empName, final int empId)
        {
            prototype.empName = empName;
            prototype.empId = empId;
        }
        
        public EmployeeBuilder age(final int age)
        {
            prototype.age = age;
            return this;
        }
        
        public EmployeeBuilder address1(final String address1)
        {
            prototype.address1 = address1;
            return this;
        }
        
        public EmployeeBuilder address2(final String address2)
        {
            prototype.address2 = address2;
            return this;
        }
        
        public EmployeeBuilder salary(final double salary)
        {
            prototype.salary = salary;
            return this;
        }
        
        public EmployeeBuilder dept(final String dept)
        {
            prototype.dept = dept;
            return this;
        }
        
        public EmployeeBuilder skillSet(final List<String> skillSet)
        {
            prototype.skillSet = skillSet;
            return this;
        }
        
        /*public Employee build()
        {
            return new Employee(this);
        }*/
    }
}
