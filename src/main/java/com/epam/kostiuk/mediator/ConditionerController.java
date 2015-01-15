package com.epam.kostiuk.mediator;

public class ConditionerController extends HouseControllerElement {

    private boolean isTurnedOn = false;

    public ConditionerController(SmartHouse houseController) {
        super(houseController);
    }

    public void turnOn() {
        isTurnedOn = true;
        LOG.info("Conditioner is turned on.");
        changed();
    }

    public void turnOn(int temperature) {
        isTurnedOn = true;
        LOG.info("Conditioner is turned on.");
        changed();
    }

    public void turnOff() {
        isTurnedOn = false;
        LOG.info("Conditioner is turned off.");
        changed();
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

}
