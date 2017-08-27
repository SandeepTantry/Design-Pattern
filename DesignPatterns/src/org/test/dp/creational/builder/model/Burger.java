package org.test.dp.creational.builder.model;

public class Burger
{
    private String bun;
    private String vada;
    private String cheese;
    private String veggie;
    
    private Burger(BurgerMaker prototype)
    {
        if (prototype != null)
        {
            this.bun = prototype.bun;
            this.vada = prototype.vada;
            this.cheese = prototype.cheese;
            this.veggie = prototype.veggie;
        }
    }
    
    public String getBun()
    {
        return bun;
    }

    public String getVada()
    {
        return vada;
    }

    public String getCheese()
    {
        return cheese;
    }

    public String getVeggie()
    {
        return veggie;
    }
    
    @Override
    public String toString()
    {
        StringBuilder burger = new StringBuilder();
        if (bun != null && bun.trim() != "") burger.append("\nBun --> " + getBun());
        if (vada != null && vada.trim() != "") burger.append("\nVada --> " + getVada());
        if (cheese != null && cheese.trim() != "") burger.append("\nCheese" + getCheese());
        if (veggie != null && veggie.trim() != "") burger.append("\nVeggie --> " + getVeggie());
        return burger.toString(); 
    }

    // static inner class
    public static class BurgerMaker
    {
        // copy all the properties
        private String bun;
        private String vada;
        private String cheese;
        private String veggie;
        
        // public constructor
        public BurgerMaker(final String bun, final String vada)
        {
            this.bun = bun;
            this.vada = vada;
        }
        
        // optional setters
        public BurgerMaker cheese(final String cheese)
        {
            this.cheese = cheese;
            return this;
        }

        public BurgerMaker veggie(final String veggie)
        {
            this.veggie = veggie;
            return this;
        }
        
        // build the object
        public Burger build()
        {
            return new Burger(this);
        }
    }
}
