package com.company.createanobject;

public class Fruit {
    public String name;
    public short yearEstablished;
    public boolean hasSeeds;

    public void fruit (String name, short yearEstablished, boolean hasSeeds){
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.hasSeeds = hasSeeds;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", hasSeeds=" + hasSeeds +
                '}';
    }
}
