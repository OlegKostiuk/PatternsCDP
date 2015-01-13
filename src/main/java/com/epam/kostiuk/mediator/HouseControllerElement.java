package com.epam.kostiuk.mediator;

import org.apache.log4j.Logger;

public class HouseControllerElement {

    public static final Logger LOG = Logger.getLogger(HouseControllerElement.class);

    private SmartHouse houseController;

    public HouseControllerElement(SmartHouse houseController) {
        this.houseController = houseController;
    }

    public void changed() {
        houseController.elementChanged(this);
    }
}
