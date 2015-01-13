package com.epam.kostiuk.state;

public class Adult extends HumanState {

    public Adult(Human human) {
        super(human);
    }

    public void retire() {
        LOG.info("To retire ...");
        human.setState(new Retirement(human));
    }
}
