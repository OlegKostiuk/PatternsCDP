package com.epam.kostiuk.state;

public class Children extends HumanState {

    public Children(Human human) {
        super(human);
    }

    public void becomeAdult() {
        LOG.info("Become adult ...");
        human.setState(new Adult(human));
    }

}
