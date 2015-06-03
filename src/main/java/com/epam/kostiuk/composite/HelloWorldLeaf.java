package com.epam.kostiuk.composite;

public class HelloWorldLeaf implements CommandComponent {

    public String getCommandName() {
        return "Say Hello world";
    }

    public void execute() {
        LOG.info("Hello World!)");
    }
}
