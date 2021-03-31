package com.tcs.encapsulation.pojo;

import java.util.Arrays;

public class CarEncapsulated {

    private String engine;
    private String[] wheels;
    public String seats;
    public String chassis;
    private String speed;

    public CarEncapsulated() {
        this.engine = "New Engine";
        this.wheels = new String[]{"new wheel", "new wheel", "new wheel", "new wheel"};
        this.seats = "New seats";
        this.chassis = "New chasis";
    }

    public void installNewEngine(String engine) {
        // TODO: write algorithm to install  new engine
        this.engine = engine;
    }

    public void changeWheels(String[] wheels) {
        // TODO: write algorithm to install  new wheels
        this.wheels = wheels;
    }

    public String measureSpeed() {
        // TODO: write algorithm to read Speed
        return speed;
    }
    public void accelerate(String speed) {
        // TODO: write algorithm to make the car accelerate
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CarEncapsulated{" +
                "engine='" + engine + '\'' +
                ", wheels=" + Arrays.toString(wheels) +
                ", seats='" + seats + '\'' +
                ", chassis='" + chassis + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
