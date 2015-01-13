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

    @Override
    public void click() {
        decoratedElement.click();
    }

    @Override
    public void submit() {
        decoratedElement.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        decoratedElement.sendKeys();
    }

    @Override
    public void clear() {
        decoratedElement.clear();
    }

    @Override
    public String getTagName() {
        return decoratedElement.getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return decoratedElement.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return decoratedElement.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return decoratedElement.isEnabled();
    }

    @Override
    public String getText() {
        return decoratedElement.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return decoratedElement.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return decoratedElement.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return decoratedElement.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return decoratedElement.getLocation();
    }

    @Override
    public Dimension getSize() {
        return decoratedElement.getSize();
    }

    @Override
    public String getCssValue(String propertyName) {
        return decoratedElement.getCssValue(propertyName);
    }
}
