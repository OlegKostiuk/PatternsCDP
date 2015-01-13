package com.epam.kostiuk.abstract_factory;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public interface BrowserFactory {

    public final Logger LOG = Logger.getLogger(BrowserFactory.class);

    WebDriver getChrome();

    WebDriver getFirefox();
}
