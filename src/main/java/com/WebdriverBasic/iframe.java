package com.WebdriverBasic;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iframe extends BaseClass {
    public static void main (String[] args) throws InterruptedException {

        launch_browser("firefox");
        open_url("https://the-internet.herokuapp.com/iframe");
        iframe_test();
       // firefox_close();


    }

    public static void iframe_test() throws InterruptedException {
        driver.switchTo().frame("mce_0_ifr");
        WebElement framebody = driver.findElement(By.id("tinymce"));
        framebody.clear();
        framebody.sendKeys("Test Automations");
        Thread.sleep(3000);

    }

}
