package com.epam.kostiuk.bridge;

public class EconomyEngine extends Engine {

    @Override
    public void accelerate(ICar car) {
        int currentSpeed = car.getSpeed();
        car.setSpeed(++currentSpeed);
    }
}
