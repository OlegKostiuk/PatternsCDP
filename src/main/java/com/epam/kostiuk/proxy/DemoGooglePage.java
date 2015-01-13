package com.epam.kostiuk.proxy;

import com.epam.kostiuk.abstract_factory.LocalBrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoGooglePage {
    private WebDriver driver = new LocalBrowserFactory().getChrome();

    private WebElementProxy textBox = new WebElementProxy(By.xpath(".//input[@class='gbqfif'][1]"), driver);

    private WebElementProxy findButton = new WebElementProxy(By.xpath(".//button[@class='gbqfba'][1]"), driver);

    public void open() {
        driver.get("https://www.google.com.ua/");
    }

    public void find(String text) {
        textBox.sendKeys(text);
        findButton.click();
    }

    public void close() {
        driver.close();
        driver.quit();
    }
}
