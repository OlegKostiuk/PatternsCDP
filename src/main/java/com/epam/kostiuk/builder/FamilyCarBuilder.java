package com.epam.kostiuk.builder;

public class FamilyCarBuilder extends CarBuilder {

    @Override
    public void setBody() {
        car.setBody("Minivan");
    }

    @Override
    public void setEngine() {
        car.setEngine(2);
    }

    @Override
    public void setWheels() {
        car.setWheelDiameter(18);
    }

    @Override
    public void paint() {
        car.setColor("White");
    }
}
