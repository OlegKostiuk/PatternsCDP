package com.epam.kostiuk.state;

import org.apache.log4j.Logger;

public abstract class HumanState {

    protected static final Logger LOG = Logger.getLogger(HumanState.class);
    protected Human human;

    public HumanState(Human human) {
        this.human = human;
    }

    public void born() {
        LOG.warn("Hasn't implementation from current state.");
    }

    public void becomeAdult() {
        LOG.warn("Hasn't implementation from current state.");
    }

    public void retire() {
        LOG.warn("Hasn't implementation from current state.");
    }

    public void die() {
        LOG.info("Die ...");
        human.setState(new Dead(human));
    }

}
