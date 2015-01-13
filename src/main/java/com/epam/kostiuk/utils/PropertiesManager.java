package com.epam.kostiuk.utils;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesManager {

    public static final Logger LOG = Logger.getLogger(PropertiesManager.class);

    private static final String DEFAULT_CONFIG_PATH = "src/main/resources/config.properties";

    private static Properties properties = null;

    public static Properties getInstance() {
        return getInstance(DEFAULT_CONFIG_PATH);
    }

    public static Properties getInstance(String filePath) {

        if (properties == null) {
            try {
                properties = new Properties();
                properties.load(new FileInputStream(filePath));

            } catch (Exception e) {
                LOG.warn(String.format("Properties configuration file %s not found.", filePath));
            }
        }

        return properties;
    }
}
