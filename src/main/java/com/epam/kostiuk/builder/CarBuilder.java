package com.epam.kostiuk.builder;

public abstract class CarBuilder {

    protected Car car;

    public void createNewCar() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

    public abstract void setBody();

    public abstract void setEngine();

    public abstract void setWheels();

    public abstract void paint();
}
