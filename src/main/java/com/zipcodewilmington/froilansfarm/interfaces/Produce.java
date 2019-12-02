package com.zipcodewilmington.froilansfarm.interfaces;

public interface Produce extends Edible {
    java.util.ArrayList<E> yield();

    void growFood();

    void beFertilized();
}
