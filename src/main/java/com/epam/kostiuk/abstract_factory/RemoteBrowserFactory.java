package com.epam.kostiuk.abstract_factory;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RemoteBrowserFactory implements BrowserFactory {

    public static final String REMOTE_URL = "http://olgkos:980952c6-0a4e-40d7-8c92-392ba8e2465c@ondemand.saucelabs.com:80/wd/hub";

    @Override
    public WebDriver getChrome() {
        DesiredCapabilities capabilities = getCapabilities("chrome", "31", Platform.XP);
        try {
            return new RemoteWebDriver(new URL(REMOTE_URL), capabilities);
        } catch (MalformedURLException e) {
            LOG.warn(e);
        }

        return null;
    }

    @Override
    public WebDriver getFirefox() {
        DesiredCapabilities capabilities = getCapabilities("firefox", "31", Platform.XP);
        try {
            RemoteWebDriver driver = new RemoteWebDriver(new URL(REMOTE_URL), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return driver;
        } catch (MalformedURLException e) {
            LOG.warn(e);
        }

        return null;
    }

    private DesiredCapabilities getCapabilities(String browser, String browserVersion, Platform platform) {

        DesiredCapabilities capabilities;

        if (browser.equalsIgnoreCase("chrome")) {
            capabilities = DesiredCapabilities.chrome();

        } else {
            capabilities = DesiredCapabilities.firefox();
        }

        if (browserVersion != null && !browserVersion.isEmpty()) {
            capabilities.setCapability(CapabilityType.VERSION, browserVersion);
        }

        capabilities.setCapability(CapabilityType.PLATFORM, platform);

        return capabilities;

    }
}
