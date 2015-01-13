package com.epam.kostiuk.composite;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCommandLeaf implements CommandComponent {
    @Override
    public String getCommandName() {
        return "Show time";
    }

    @Override
    public void execute() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        LOG.info("Current time: " + dateFormat.format(date));
    }
}
