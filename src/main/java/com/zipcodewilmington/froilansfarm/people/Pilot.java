package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;

public class Pilot extends Person {
    private Aircraft aircraft;

    public Pilot(String name) {
        super(name);
    }


    public Aircraft getAircraft() {
        return aircraft;
    }

    @Override
    public String makeNoise() {
        return "Pilot goes whoosh!";
    }


    public void fly(Aircraft aircraft){
        //aircraft
        this.aircraft=aircraft;
    }

    public void stopFlying(){
        this.aircraft=null;
    }
}