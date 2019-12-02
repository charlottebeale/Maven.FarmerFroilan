package com.zipcodewilmington.froilansfarm.animals;
import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Animal {
    public String makeNoise() {
        return "noise";
    }

    public String eat(Edible edible) {
        return "numnum";
    }

    public String eat(EarCorn earCorn) {
        return "numnum";
    }
}
