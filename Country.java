package com.company.createanobject;

public class Country {

    public String name;
    public long population;
    public String capital;

    public void country (String name, long population, String capital){
        this.name = name;
        this.population = population;
        this.capital = capital;

    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                '}';
    }
}
