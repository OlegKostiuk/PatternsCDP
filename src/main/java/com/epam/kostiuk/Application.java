package com.epam.kostiuk;

import com.epam.kostiuk.abstract_factory.BrowserFactory;
import com.epam.kostiuk.abstract_factory.LocalBrowserFactory;
import com.epam.kostiuk.abstract_factory.RemoteBrowserFactory;
import com.epam.kostiuk.adapter.CelsiusAdapter;
import com.epam.kostiuk.adapter.FahrenheitThermometer;
import com.epam.kostiuk.adapter.SmartConditioner;
import com.epam.kostiuk.bridge.EconomyEngine;
import com.epam.kostiuk.bridge.ICar;
import com.epam.kostiuk.bridge.PowerfullEngine;
import com.epam.kostiuk.bridge.SportCar;
import com.epam.kostiuk.builder.Car;
import com.epam.kostiuk.builder.CarFactory;
import com.epam.kostiuk.builder.FamilyCarBuilder;
import com.epam.kostiuk.builder.SportCarBuilder;
import com.epam.kostiuk.composite.*;
import com.epam.kostiuk.decorator.CheckBox;
import com.epam.kostiuk.factory_method.WebDriverFactory;
import com.epam.kostiuk.mediator.SmartHouse;
import com.epam.kostiuk.proxy.DemoGooglePage;
import com.epam.kostiuk.state.Human;
import com.epam.kostiuk.strategy_templatemethod.ArraySorter;
import com.epam.kostiuk.strategy_templatemethod.AscBubbleSort;
import com.epam.kostiuk.strategy_templatemethod.DescBubbleSort;
import com.epam.kostiuk.utils.PropertiesManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class Application {

    public static final Logger LOG = Logger.getLogger(Application.class);

    public static void main(String args[]) {
        runBridge();
        runAdapter();
        runMediator();
        runStrategy();
        runProxy();
        runBuilder();
        runState();
        runAbstractFactory();
        runFactoryMethod();
        runDecorator();
        runComposite();
    }

    private static void runBridge() {
        ICar sportCar = new SportCar(new PowerfullEngine());
        sportCar.drive();

        ICar economySportCar = new SportCar(new EconomyEngine());
        economySportCar.drive();
    }

    private static void runAdapter() {
        CelsiusAdapter thermometerAdapter = new CelsiusAdapter(new FahrenheitThermometer());
        SmartConditioner smartConditioner = new SmartConditioner(thermometerAdapter);
        LOG.info("Trying turn on conditioner:");
        smartConditioner.turnOnConditioner();
    }

    private static void runComposite() {
        CommandComposite mainMenu = new CommandComposite("");

        CommandComposite timeRootMenu = new CommandComposite("Time");

        timeRootMenu.addCommand(new TimeCommandLeaf());
        timeRootMenu.addCommand(new DateCommandLeaf());

        mainMenu.addCommand(timeRootMenu);
        mainMenu.addCommand(new HelloWorldLeaf());
        mainMenu.addCommand(new ExitCommandLeaf());

        while (true) {
            mainMenu.execute();
        }
    }

    private static void runMediator() {
        SmartHouse smartHouse = new SmartHouse();
        smartHouse.controllConditioner(true);
        smartHouse.controllWindows(true);
    }

    private static void runStrategy() {
        ArraySorter arraySorter = new ArraySorter();

        arraySorter.changeStrategy(new AscBubbleSort());
        int[] a = {1, 58, 8, 4, 1, 5, 4, 2, 4};
        System.out.println(Arrays.toString(arraySorter.sort(a)));

        int[] b = {4, 7, 84, 5, 4, 7, 8, 4, 55, 4};
        arraySorter.changeStrategy(new DescBubbleSort());
        System.out.println(Arrays.toString(arraySorter.sort(b)));
    }

    private static void runProxy() {
        DemoGooglePage demoGooglePage = new DemoGooglePage();
        demoGooglePage.open();
        demoGooglePage.find("Proxy");
        demoGooglePage.close();
    }

    private static void runBuilder() {
        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        FamilyCarBuilder familyCarBuilder = new FamilyCarBuilder();

        CarFactory carFactory = new CarFactory();

        carFactory.setCarBuilder(sportCarBuilder);
        Car sportCar = carFactory.getCar();
        LOG.info(sportCar);

        carFactory.setCarBuilder(familyCarBuilder);
        Car familyCar = carFactory.getCar();
        LOG.info(familyCar);

    }

    private static void runState() {
        Human human = new Human();
        human.becomeAdult();
        human.retire();
        human.die();

        Human human1 = new Human();
        human1.retire();
    }

    private static void runAbstractFactory() {
        BrowserFactory browserFactory = new LocalBrowserFactory();
        WebDriver driver = browserFactory.getChrome();
        driver.get("http://google.com/");
        driver.close();
        driver.quit();

        BrowserFactory remoteBrowserFactory = new RemoteBrowserFactory();
        WebDriver remoteDriver = remoteBrowserFactory.getFirefox();
        remoteDriver.get("http://google.com/");
        remoteDriver.close();
        remoteDriver.quit();
    }

    private static void runDecorator() {
        String driverName = PropertiesManager.getInstance().getProperty("factory_method.driverName");
        WebDriver webDriver = WebDriverFactory.getWebDriver(driverName);
        webDriver.get("https://accounts.google.com/ServiceLogin?service=mail");
        CheckBox checkBox = new CheckBox(webDriver.findElement(By.id("PersistentCookie")));
        checkBox.check();
        webDriver.close();
    }

    private static void runFactoryMethod() {
        String driverName = PropertiesManager.getInstance().getProperty("factory_method.driverName");
        WebDriver webDriver = WebDriverFactory.getWebDriver(driverName);
        webDriver.get("http://google.com/");
        webDriver.close();
    }

}

