package com.OpenCart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginTestProperties extends BaseClass {
    public static void main(String[] args) throws IOException {

        //firefox_launch();
        launch_browser("firefox");
        open_url("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
        TC_Login_001();

    }

    public static void TC_Login_001() throws IOException {

        FileInputStream fls = new FileInputStream("./src/propertiesfile/config.properties");
        Properties prop = new Properties();
        prop.load(fls);

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(prop.getProperty("Valid_Email"));

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys(prop.getProperty("Valid_Password"));

        WebElement loginBTN = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div[2]/div[1]/form/div[3]/div[1]/button[1]"));
        loginBTN.click();
    }
}
