package com.epam.kostiuk.composite;

public class ExitCommandLeaf implements CommandComponent  {

    @Override
    public String getCommandName() {
        return "Exit";
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
