package com.epam.kostiuk.adapter;

import org.apache.log4j.Logger;

// works only with celsius
public class SmartConditioner {

    public static final Logger LOG = Logger.getLogger(SmartConditioner.class);

    private CelsiusThermometer celsiusThermometer;

    public SmartConditioner(CelsiusThermometer celsiusThermometer) {
        this.celsiusThermometer = celsiusThermometer;
    }

    public void turnOnConditioner() {
        double current = celsiusThermometer.getCurrentTemperature().getValue();
        if (current > 25 || current < 20) {
            LOG.info(current + " Smart house will turn on conditioner.");
        } else {
            LOG.info(current + " Temperature is ok.");
        }
    }
}
