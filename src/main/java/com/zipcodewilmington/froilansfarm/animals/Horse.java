package com.zipcodewilmington.froilansfarm.animals;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Horse extends Animal implements Ridable, Eater {
    @Override
    public String eat(Edible edible) {
        return "Yum! Corn! I'm a happy horse yeehaw!";
    }

    @Override
    public String eat(Egg egg) {
        return "yummy";
    }

    public String makeNoise(){
        return "Neigh!";
    }

}
