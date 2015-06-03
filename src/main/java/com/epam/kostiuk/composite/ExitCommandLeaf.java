package com.epam.kostiuk.composite;

public class ExitCommandLeaf implements CommandComponent {

    public String getCommandName() {
        return "Exit";
    }

    public void execute() {
        System.exit(0);
    }
}
