package com.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

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

    //find element & click
    public static void findelementbyID_click(String id){driver.findElement(By.id(id)).click();}
    public static void findelementbyname_click(String name){driver.findElement(By.name(name)).click();}
    public static void findelementbyxpath_click(String xpath){driver.findElement(By.xpath(xpath)).click();}
    public static void findelementbycss_click(String css){driver.findElement(By.cssSelector(css)).click();}

   //find element and type
   public static void findelementbyID_Type(String id, String text){driver.findElement(By.id(id)).sendKeys(text);}
    public static void findelementbyname_text(String name,String text){driver.findElement(By.name(name)).sendKeys(text);}
    public static void findelementbyxpath_text(String xpath, String text){driver.findElement(By.xpath(xpath)).sendKeys(text);}
    public static void findelementbycss_text(String css,String text){driver.findElement(By.cssSelector(css)).sendKeys(text);}


    // screen shot method
    public static void getvisiblepartscreenshot(String imageName) throws IOException {        //capture sceenshoot

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //save

        FileUtils.copyFile(screenshot, new File("./ScreenshotImages/" + imageName + ".jpeg"), true);


    }
}
