package com.epam.kostiuk.bridge;

public class PowerfullEngine extends Engine {

    @Override
    public void accelerate(ICar car) {
        int currentSpeed = car.getSpeed();
        car.setSpeed((currentSpeed+1) * 2);
    }
}
