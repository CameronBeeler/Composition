package com.cambeeler;

public class Car extends Vehicle {
    private int doors;
    private int engineVolume;

    public Car(String name, int doors, int engineVolume) {
        super(name);
        this.doors = doors;
        this.engineVolume = engineVolume;
    }

//    GETTER

    public int getDoors() {
        return doors;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

//    SETTER

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }


}
