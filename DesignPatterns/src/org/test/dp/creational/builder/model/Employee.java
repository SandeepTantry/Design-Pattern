package org.test.dp.creational.builder.model;

import java.util.List;

public class Employee
{
    private String empName;
    private Integer empId;
    private Integer age;
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

    public Integer getEmpId()
    {
        return empId;
    }

    public Integer getAge()
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
    
    @Override
    public String toString()
    {
        StringBuilder emp = new StringBuilder();
        if (empName != null && empName.trim() != "") emp.append("\nName --> " + getEmpName());
        if (empId != null) emp.append("\nId --> " + getEmpId());
        if (age != null) emp.append("\nAge --> " + getAge());
        if (address1 != null && address1.trim() != "") emp.append("\nAddr --> " + getAddress1());
        if (address2 != null && address2.trim() != "") emp.append(" - " + getAddress2());
        if (salary != null) emp.append("\nSalary --> " + getSalary());
        if (dept != null && dept.trim() != "") emp.append("\nDept --> " + getDept());
        if (skillSet != null && !skillSet.isEmpty()) emp.append("\nSkills --> " + getSkillSet());
        return emp.toString();
    }
    
    // ----------------------------------
    
    // optional methods
    public Employee cloneInstance()
    {
        return new Employee(this);
    }
    
    public static EmployeeBuilder fromEmployee(Employee prototype)
    {
        return new EmployeeBuilder(prototype);
    }
    
    // no args builder (optional)
    public static EmployeeBuilder basicEmployee()
    {
        return basicEmployee(null, null);
    }

    // outer interface method
    public static EmployeeBuilder basicEmployee(final String empName, final Integer empId)
    {
        return new EmployeeBuilder(empName, empId);
    }

    // Builder class
    public static class EmployeeBuilder
    {
        private Employee prototype;
        
        // required params.
        private EmployeeBuilder(final String empName, final Integer empId)
        {
            prototype = new Employee(null);
            prototype.empName = empName;
            prototype.empId = empId;
        }
        
        // optional (mixture of prototype)
        private EmployeeBuilder(final Employee prototype)
        {
            this.prototype = prototype != null ? prototype.cloneInstance() : new Employee(null); 
        }
        
        // optional params
        public EmployeeBuilder age(final Integer age)
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
        
        public Employee build()
        {
            // both will work
            //return new Employee(prototype);
            return prototype.cloneInstance();
        }
    }
}
