package com.epam.kostiuk.builder;

public class SportCarBuilder extends CarBuilder {

    @Override
    public void setBody() {
        car.setBody("Coupe");
    }

    @Override
    public void setEngine() {
        car.setEngine(5);
    }

    @Override
    public void setWheels() {
        car.setWheelDiameter(22);
    }

    @Override
    public void paint() {
        car.setColor("Red");
    }
}
