package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;

public class Vehicle implements Ridable, NoiseMaker {
    public String makeNoise() {
        return "<clank>";
    }
}
