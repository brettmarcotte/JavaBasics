package com.company.createanobject;

public class createAnObject {

    public String species;
    public short legs;
    public boolean livesOnLand;

    public void Animal (String species, short legs, boolean livesOnLand){
        this.species = species;
        this.legs = legs;
        this.livesOnLand = livesOnLand;

    }


    @Override
    public String toString() {
        return "createAnObject{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", livesOnLand=" + livesOnLand +
                '}';
    }
}
