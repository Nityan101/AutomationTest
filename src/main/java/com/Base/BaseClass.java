package com.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static WebDriver driver;

        //  for dynamic browser
    public static void launch_browser(String browserName){
        if (browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }

        else if(browserName.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
        }
        else {
            System.out.println("Enter Valid Browser Name");
        }


    }
    public static void browser_close(String browserName)
    {
        driver.close();
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

    public static void open_url(String url){
        driver.get(url);
    }

}
