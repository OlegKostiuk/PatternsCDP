package com.epam.kostiuk.mediator;

import org.apache.log4j.Logger;

public class SmartHouse {

    public static final Logger LOG = Logger.getLogger(SmartHouse.class);

    private WindowsController windowsController;
    private ConditionerController conditionerController;

    public SmartHouse() {
        windowsController = new WindowsController(this);
        conditionerController = new ConditionerController(this);
    }

    public void elementChanged(HouseControllerElement element) {
        if (element instanceof ConditionerController) {
            if (((ConditionerController) element).isTurnedOn()) {
                LOG.info("Conditioner is turned on thus we should close windows.");
                windowsController.close();
            }

        } else if (element instanceof WindowsController) {

            if (((WindowsController) element).isOpened()) {
                LOG.info("Windows is opened thus we should turn off conditioner.");
                conditionerController.turnOff();
            }

        }

    }

    public void controllConditioner(boolean turnOn) {
        if (turnOn) {
            conditionerController.turnOn();
        } else {
            conditionerController.turnOff();
        }
    }

    public void controllWindows(boolean open) {
        if (open) {
            windowsController.open();
        } else {
            windowsController.close();
        }
    }
}
