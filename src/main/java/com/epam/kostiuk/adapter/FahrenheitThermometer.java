package com.epam.kostiuk.adapter;

import java.util.Random;

public class FahrenheitThermometer {

    public Fahrenheit getTemperature() {
        Fahrenheit f = new Fahrenheit();
        f.setValue(new Random().nextInt(36)+50);
        return f;
    }
}
