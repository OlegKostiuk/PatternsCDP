package com.epam.kostiuk.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandComposite implements CommandComponent {

    private List<CommandComponent> commandComponents = new ArrayList<CommandComponent>();

    private String name;

    public CommandComposite(String name) {
        this.name = name;
    }

    public String getCommandName() {
        return name;
    }

    public void execute() {
        LOG.info("Choose command:");
        for (int i = 0; i < commandComponents.size(); i++) {
            LOG.info(i + ". " + commandComponents.get(i).getCommandName());
        }

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i < commandComponents.size()) {
            commandComponents.get(i).execute();
        } else {
            LOG.info("Command doesn't exist");
        }
    }

    public void addCommand(CommandComponent commandComponent) {
        commandComponents.add(commandComponent);
    }
}
