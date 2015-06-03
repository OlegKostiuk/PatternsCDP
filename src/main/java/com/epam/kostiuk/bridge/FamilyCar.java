package com.epam.kostiuk.bridge;

import java.util.Random;

public class FamilyCar extends ICar {

    public FamilyCar(Engine engine) {
        super(engine);
    }

    public void drive() {
        System.out.println("We will ride slow");
        while(speed<60) {
            System.out.println("Current speed:" + speed);
            if(speed < 40 || new Random().nextInt(100) < 50) {
                engine.accelerate(this);
            }
        }
    }
}
