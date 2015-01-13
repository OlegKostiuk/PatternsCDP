package com.epam.kostiuk.composite;

import org.apache.log4j.Logger;

public interface CommandComponent {
    public static final Logger LOG = Logger.getLogger(CommandComponent.class);

    public String getCommandName();

    public void execute();
}
