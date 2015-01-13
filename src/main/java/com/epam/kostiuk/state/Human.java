package com.epam.kostiuk.state;

import org.apache.log4j.Logger;

public class Human {

    private Logger LOG = Logger.getLogger(Human.class);
    private HumanState state;

    public Human() {
        LOG.info("Born ...");
        this.state = new Children(this);
    }

    public void setState(HumanState state) {
        this.state = state;
    }

    public void becomeAdult() {
        state.becomeAdult();
    }

    public void retire() {
        state.retire();
    }

    public void die() {
        state.die();
    }
}
