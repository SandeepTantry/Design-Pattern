package org.practice.springBoot.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Customer
{
    private String name;
    private Long id;
    private String addr;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(final String name)
    {
        this.name = name;
    }
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(final Long id)
    {
        this.id = id;
    }
    
    public String getAddr()
    {
        return addr;
    }
    
    public void setAddr(final String addr)
    {
        this.addr = addr;
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(final Object that)
    {
        return EqualsBuilder.reflectionEquals(that, that, false);
    }
    
    @Override
    public int hashCode()
    {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
