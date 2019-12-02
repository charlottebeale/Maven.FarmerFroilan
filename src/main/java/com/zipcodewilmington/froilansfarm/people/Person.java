package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Person implements Rider, Eater, NoiseMaker {
    private String name;
    private Ridable ridingDevice;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String eat(Edible edible) {
        return "Yum!";
    }

    public String makeNoise() {
        return "Blah blah blah";
    }



    @Override
    public void mount(Ridable ridable) {

    }

    public void dismount() {
        this.ridingDevice = null;
    }

    public Ridable getRidingDevice() {
        return this.ridingDevice;
    }
}
