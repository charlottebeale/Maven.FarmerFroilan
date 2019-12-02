package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Farmer extends Botanist {


    public Farmer(String name) {
        super(name);
    }


    @Override
    public String eat(Edible edible) {
        return "Yum! Fuel for a farmer!";
    }

    @Override
    public String makeNoise() {
        return "Early to bed, early to rise...";
    }


    @Override
    public void plant(Class cropClass, CropRow cropRow) {
        super.plant(cropClass, cropRow);
    }
}