package com.WebdriverBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {
    public static void main(String[] args) throws IOException {
        FileInputStream fls = new FileInputStream("./src/propertiesfile/config.properties");
        Properties prop = new Properties();
        prop.load(fls);

        System.out.println(prop.getProperty("Valid_Email"));
        System.out.println(prop.getProperty("Valid_Password"));

    }
}
