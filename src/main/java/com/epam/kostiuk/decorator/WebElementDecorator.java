package com.epam.kostiuk.decorator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebElementDecorator implements WebElement {

    protected WebElement decoratedElement;

    public WebElementDecorator(WebElement decoratedElement) {
        this.decoratedElement = decoratedElement;
    }

    public WebElement getDecoratedElement() {
        return decoratedElement;
    }

    public void setDecoratedElement(WebElement decoratedElement) {
        this.decoratedElement = decoratedElement;
    }

    public void click() {
        decoratedElement.click();
    }

    public void submit() {
        decoratedElement.submit();
    }

    public void sendKeys(CharSequence... keysToSend) {
        decoratedElement.sendKeys();
    }

    public void clear() {
        decoratedElement.clear();
    }

    public String getTagName() {
        return decoratedElement.getTagName();
    }

    public String getAttribute(String name) {
        return decoratedElement.getAttribute(name);
    }

    public boolean isSelected() {
        return decoratedElement.isSelected();
    }

    public boolean isEnabled() {
        return decoratedElement.isEnabled();
    }

    public String getText() {
        return decoratedElement.getText();
    }

    public List<WebElement> findElements(By by) {
        return decoratedElement.findElements(by);
    }

    public WebElement findElement(By by) {
        return decoratedElement.findElement(by);
    }

    public boolean isDisplayed() {
        return decoratedElement.isDisplayed();
    }

    public Point getLocation() {
        return decoratedElement.getLocation();
    }

    public Dimension getSize() {
        return decoratedElement.getSize();
    }

    public String getCssValue(String propertyName) {
        return decoratedElement.getCssValue(propertyName);
    }
}
