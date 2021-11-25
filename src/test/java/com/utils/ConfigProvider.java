package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {

    static Properties properties;

    private static Properties properties() {

        if (properties == null) {
            File file = new File(System.getProperty("user.dir") + "//src//test//resources//properties//application.properties");
            FileInputStream fileInput;
            properties = new Properties();
            try {
                fileInput = new FileInputStream(file);
                properties.load(fileInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public static String getProperty(String key) {
        return properties().getProperty(key);
    }
}