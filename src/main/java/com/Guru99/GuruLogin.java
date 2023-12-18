package com.Guru99;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GuruLogin extends BaseClass {
    public static void main(String[] args){
        launch_browser("firefox");
        open_url("https://demo.guru99.com/V1/index.php");
        TC_Login_001();


    }

    public static void TC_Login_001(){
        WebElement user = driver.findElement(By.name("uid"));
        user.clear();
        user.sendKeys("mngr543177");

        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("ytAdUbu");

        WebElement loginBTN = driver.findElement(By.name("btnLogin"));
        loginBTN.click();
    }
}
