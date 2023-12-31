package com.WebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {
    public static WebDriver driver;

    public static void main(String[] args){
        chrome_launch();
        firefox_launch();
        Edge();

        chrome_close();
        firefox_close();
        Edge();

    }

    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.close();
    }
    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.close();
    }
    public static void Edge(){
        WebDriver driver;
        System.setProperty("webdriver.msedge.driver","./src/main/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.close();
    }
    public static void chrome_close(){
        driver.close();
    }
    public static void firefox_close(){
        driver.close();
    }
    public static void Edge_close(){
        driver.close();
    }

}
