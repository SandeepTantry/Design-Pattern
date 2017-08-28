package org.test.dp.creational.prototype.model;

public class Address implements Cloneable
{
    private String doorNo;
    private String houseName;
    private String streetNo;
    private String areaName;
    private String city;
    private String state;
    private Integer pincode;
    
    private Address(final Address address)
    {
        if (address != null)
        {
            this.doorNo = address.doorNo;
            this.houseName = address.houseName;
            this.streetNo = address.streetNo;
            this.areaName = address.areaName;
            this.city = address.city;
            this.state = address.state;
            this.pincode = address.pincode;
        }
    }

    public String getDoorNo()
    {
        return doorNo;
    }

    public String getHouseName()
    {
        return houseName;
    }

    public String getStreetNo()
    {
        return streetNo;
    }

    public String getAreaName()
    {
        return areaName;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public Integer getPincode()
    {
        return pincode;
    }
    
    @Override
    public String toString()
    {
        StringBuilder addr = new StringBuilder();
        if (doorNo != null && doorNo.trim() != "") addr.append("\nDoorNo --> " + getDoorNo());
        if (houseName != null && houseName.trim() != "") addr.append("\nHouseName --> " + getHouseName());
        if (streetNo != null && streetNo.trim() != "") addr.append("\nStreetNo --> " + getStreetNo());
        if (areaName != null && areaName.trim() != "") addr.append("\nAreaName --> " + getAreaName());
        if (city != null && city.trim() != "") addr.append("\nCity --> " + getCity());
        if (state != null && state.trim() != "") addr.append("\nState --> " + getState());
        if (pincode != null) addr.append("\nPincode --> " + getPincode());
        return addr.toString(); 
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == null || !(o instanceof Address)) return false;
        
        Address addr = (Address) o;
        
        if (this.doorNo.equals(addr.doorNo) &&
            this.houseName.equals(addr.houseName) &&
            this.streetNo.equals(addr.streetNo) &&
            this.areaName.equals(addr.areaName) &&
            this.city.equals(addr.city) &&
            this.state.equals(addr.state) &&
            this.pincode.equals(addr.pincode)) return true;

        return false;
    }
    
    // --------------
    
    /*@Override
    public Object clone()
    {
        try
        {
            return new Address(this);
        }
        finally
        {
            System.out.prIntegerln("Clone not supported...");
        }
    }*/
    
    public static AddressBuilder defaultAddr()
    {
        return new AddressBuilder(null);
    }
    
    public static AddressBuilder fromAddr(final Address prototype)
    {
        return new AddressBuilder(prototype);
    }
    
    public static class AddressBuilder
    {
        private Address prototype;
        
        private AddressBuilder(final Address prototype)
        {
            //this.prototype = (prototype != null) ? (Address) prototype.clone() : new Address(null);
            this.prototype = (prototype != null) ? new Address(prototype) : new Address(null);
        }
        
        public AddressBuilder doorNo(final String value)
        {
            prototype.doorNo = value;
            return this;
        }
        
        public AddressBuilder houseName(final String value)
        {
            prototype.houseName = value;
            return this;
        }
        
        public AddressBuilder streetNo(final String value)
        {
            prototype.streetNo = value;
            return this;
        }
        
        public AddressBuilder areaName(final String value)
        {
            prototype.areaName = value;
            return this;
        }
        
        public AddressBuilder city(final String value)
        {
            prototype.city = value;
            return this;
        }
        
        public AddressBuilder state(final String value)
        {
            prototype.state = value;
            return this;
        }
        
        public AddressBuilder pincode(final Integer value)
        {
            prototype.pincode = value;
            return this;
        }
        
        public Address build()
        {
            // return (Address) prototype.clone();
            return new Address(prototype);
        }
    }
}
