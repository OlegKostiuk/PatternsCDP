package com.epam.kostiuk.bridge;

public abstract class ICar {

    protected Engine engine;

    protected int speed = 0;

    public ICar(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
