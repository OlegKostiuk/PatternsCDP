package com.epam.kostiuk.bridge;

public class SportCar implements ICar {

    protected Engine engine;

    public SportCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.accelerate();
    }
}
