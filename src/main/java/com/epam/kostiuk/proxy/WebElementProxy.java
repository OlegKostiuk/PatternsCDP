package com.epam.kostiuk.proxy;

import org.openqa.selenium.*;

import java.util.List;

public class WebElementProxy implements WebElement {

    private WebElement webElement;
    private WebDriver webDriver;
    private By findBy;

    public WebElementProxy(By findBy, WebDriver webDriver) {
        this.webDriver = webDriver;
        this.findBy = findBy;
    }

    public void click() {
        webElementLazyInitialization();
        webElement.click();
    }

    public void submit() {
        webElementLazyInitialization();
        webElement.submit();
    }

    public void sendKeys(CharSequence... keysToSend) {
        webElementLazyInitialization();
        webElement.sendKeys();
    }

    public void clear() {
        webElementLazyInitialization();
        webElement.clear();
    }

    public String getTagName() {
        webElementLazyInitialization();
        return webElement.getTagName();
    }

    public String getAttribute(String name) {
        webElementLazyInitialization();
        return webElement.getAttribute(name);
    }

    public boolean isSelected() {
        webElementLazyInitialization();
        return webElement.isSelected();
    }

    public boolean isEnabled() {
        webElementLazyInitialization();
        return webElement.isEnabled();
    }

    public String getText() {
        webElementLazyInitialization();
        return webElement.getText();
    }

    public List<WebElement> findElements(By by) {
        webElementLazyInitialization();
        return webElement.findElements(by);
    }

    public WebElement findElement(By by) {
        webElementLazyInitialization();
        return webElement.findElement(by);
    }

    public boolean isDisplayed() {
        webElementLazyInitialization();
        return webElement.isDisplayed();
    }

    public Point getLocation() {
        webElementLazyInitialization();
        return webElement.getLocation();
    }

    public Dimension getSize() {
        webElementLazyInitialization();
        return webElement.getSize();
    }

    public String getCssValue(String propertyName) {
        webElementLazyInitialization();
        return webElement.getCssValue(propertyName);
    }

    private void webElementLazyInitialization() {
        if (webElement == null) {
            webElement = webDriver.findElement(findBy);
        }
    }
}
