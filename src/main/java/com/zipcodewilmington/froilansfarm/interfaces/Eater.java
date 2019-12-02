package com.zipcodewilmington.froilansfarm.interfaces;
import com.zipcodewilmington.froilansfarm.edibles.Egg;

public interface Eater {

    String eat(Edible edible);

    String eat(Egg egg);
}