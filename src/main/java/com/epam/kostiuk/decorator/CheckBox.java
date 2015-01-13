package com.epam.kostiuk.decorator;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public class CheckBox extends WebElementDecorator {

    private static final Logger LOG = Logger.getLogger(CheckBox.class);

    public CheckBox(WebElement decoratedElement) {
        super(decoratedElement);
    }

    public void check() {
        if (!decoratedElement.isSelected()) {
            LOG.info("Check check box");
            decoratedElement.click();
        }
    }

    public boolean isChecked() {
        LOG.info("Check that checkbox is checked");
        return decoratedElement.isSelected();
    }

}
