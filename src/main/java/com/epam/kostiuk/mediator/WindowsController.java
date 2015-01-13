package com.epam.kostiuk.mediator;

public class WindowsController extends HouseControllerElement {

    private boolean isOpened = false;

    public WindowsController(SmartHouse houseController) {
        super(houseController);
    }

    public void close() {
        isOpened = false;
        LOG.info("Window is closed.");
        changed();
    }

    public void open() {
        isOpened = true;
        LOG.info("Window is opened.");
        changed();
    }

    public boolean isOpened() {
        return isOpened;
    }
}
