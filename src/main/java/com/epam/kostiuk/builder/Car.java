package com.epam.kostiuk.builder;

public class Car {
    private String body;
    private int engine;
    private int wheelDiameter;
    private String color;

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s]", body, engine, wheelDiameter, color);
    }
}
