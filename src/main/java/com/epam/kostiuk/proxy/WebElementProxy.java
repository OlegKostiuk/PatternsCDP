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

    @Override
    public void click() {
        webElementLazyInitialization();
        webElement.click();
    }

    @Override
    public void submit() {
        webElementLazyInitialization();
        webElement.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        webElementLazyInitialization();
        webElement.sendKeys();
    }

    @Override
    public void clear() {
        webElementLazyInitialization();
        webElement.clear();
    }

    @Override
    public String getTagName() {
        webElementLazyInitialization();
        return webElement.getTagName();
    }

    @Override
    public String getAttribute(String name) {
        webElementLazyInitialization();
        return webElement.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        webElementLazyInitialization();
        return webElement.isSelected();
    }

    @Override
    public boolean isEnabled() {
        webElementLazyInitialization();
        return webElement.isEnabled();
    }

    @Override
    public String getText() {
        webElementLazyInitialization();
        return webElement.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        webElementLazyInitialization();
        return webElement.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        webElementLazyInitialization();
        return webElement.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        webElementLazyInitialization();
        return webElement.isDisplayed();
    }

    @Override
    public Point getLocation() {
        webElementLazyInitialization();
        return webElement.getLocation();
    }

    @Override
    public Dimension getSize() {
        webElementLazyInitialization();
        return webElement.getSize();
    }

    @Override
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
