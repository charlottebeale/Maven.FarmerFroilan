package com.zipcodewilmington.froilansfarm.vehicles;

public abstract class Aircraft extends Vehicle {

    private boolean isFlying;


    public boolean fly() {
        isFlying = true;
        return isFlying;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public boolean land() {
        isFlying = false;
        return false;
    }

}
