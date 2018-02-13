package org.test.dp.behavioral.visitor.model;

public class Ola implements CabBooking
{
    private String vehicleNo;
    private String driverName;
    private float fare;
    private TYPE type;

    public Ola(
        final String vehicleNo,
        final String driverName,
        final float fare,
        final TYPE type)
    {
        this.vehicleNo = vehicleNo;
        this.driverName = driverName;
        this.fare = fare;
        this.type = type;
    }
    
    public String getVehicleNo()
    {
        return vehicleNo;
    }
    
    public String getDriverName()
    {
        return driverName;
    }
    
    public float getFare()
    {
        return fare;
    }
    
    public TYPE getType()
    {
        return type;
    }
    
    @Override
    public void accept(final Traveller t)
    {
        t.travel(this);
    }
    
    @Override
    public String getDetails()
    {
        return "Driver Name = " + getDriverName() +
               "\nCab Type = " + getType().getName() +
               "\nVehicleNo = " + getVehicleNo() +
               "\nCapacity = " + getType().getCapacity();
    }
}
