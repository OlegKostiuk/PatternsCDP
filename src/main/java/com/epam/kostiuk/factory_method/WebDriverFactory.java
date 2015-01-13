package com.epam.kostiuk.factory_method;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

    public static final Logger LOG = Logger.getLogger(WebDriverFactory.class);
    private static final String IEDRIVER_PATH_VALUE = "src/main/resources/IEDriverServer.exe";
    private static final String CHROMEDRIVER_PATH_VALUE = "src/main/resources/chromedriver.exe";

    public static WebDriver getWebDriver(String driverName) {

        if (driverName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH_VALUE);
            return new ChromeDriver();

        } else if (driverName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", IEDRIVER_PATH_VALUE);
            return new InternetExplorerDriver();
        } else {
            return new FirefoxDriver();
        }
    }
}
