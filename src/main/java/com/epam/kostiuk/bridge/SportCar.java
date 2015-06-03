package com.epam.kostiuk.bridge;

public class SportCar extends ICar {

    public SportCar(Engine engine) {
        super(engine);
    }

    public void drive() {
        System.out.println("We will ride fast");
        while(speed < 200) {
            System.out.println("Current speed:" + speed);
            engine.accelerate(this);
        }
    }
}
