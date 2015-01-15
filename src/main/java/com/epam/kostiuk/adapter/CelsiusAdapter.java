package com.epam.kostiuk.adapter;

public class CelsiusAdapter implements CelsiusThermometer {
    private FahrenheitThermometer fahrenheitThermometer;

    public CelsiusAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    @Override
    public Celsius getCurrentTemperature() {
        Fahrenheit fahrenheit = fahrenheitThermometer.getTemperature();
        Celsius celsius = new Celsius();
        celsius.setValue(100.0 / (212.0 - 32.0) * (fahrenheit.getValue() - 32.0));
        return celsius;
    }
}
