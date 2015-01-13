package com.epam.kostiuk.composite;

public class HelloWorldLeaf implements CommandComponent {
    @Override
    public String getCommandName() {
        return "Say Hello world";
    }

    @Override
    public void execute() {
        LOG.info("Hello World!)");
    }
}
