package com.epam.kostiuk.builder;

public class CarFactory {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        madeCar();
        return carBuilder.getCar();
    }

    private void madeCar() {
        carBuilder.createNewCar();
        carBuilder.setBody();
        carBuilder.setEngine();
        carBuilder.setWheels();
        carBuilder.paint();
    }
}
