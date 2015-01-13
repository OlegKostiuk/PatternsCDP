package com.epam.kostiuk.composite;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCommandLeaf implements CommandComponent {
    @Override
    public String getCommandName() {
        return "Show Date";
    }

    @Override
    public void execute() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        LOG.info("Current date: " + dateFormat.format(date));
    }
}
