package com.epam.kostiuk.abstract_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalBrowserFactory implements BrowserFactory {

    private static final String CHROMEDRIVER_PATH_VALUE = "src/main/resources/chromedriver.exe";

    @Override
    public WebDriver getChrome() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH_VALUE);
        return new ChromeDriver();
    }

    @Override
    public WebDriver getFirefox() {
        return new FirefoxDriver();
    }
}
