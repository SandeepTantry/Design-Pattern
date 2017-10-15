package org.test.dp.behavioral.visitor.model;

public interface CabBooking
{
    void accept(final Traveller t);
    
    default String getDetails()
    {
        throw new RuntimeException("Should override this method");
    }
    
    public enum TYPE
    {
        MINI("Mini", 4),
        SHARE("Share", 4),
        SEDAN("Sedan", 4),
        INNOVA("Innova", 7),
        RICK("Rickshaw", 3);

        private String name;
        private int capacity;

        private TYPE(final String name, final int capacity)
        {
            this.name = name;
            this.capacity = capacity;
        }
        
        public String getName()
        {
            return name;
        }
        
        public int getCapacity()
        {
            return capacity;
        }
    }
}
