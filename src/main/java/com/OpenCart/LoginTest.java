package com.OpenCart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseClass {

    public static void main(String[] args){

        //firefox_launch();
        launch_browser("firefox");
        open_url("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
        TC_Login_001();

        launch_browser("firefox");
        open_url("https://www.google.com/webhp?hl=bn&sa=X&ved=0ahUKEwilg4iqz_iCAxUQavUHHfCrCWoQPAgJ");
        TC_Login_002();
    }

    public static void TC_Login_001(){
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456789");

        WebElement loginBTN = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div[2]/div[1]/form/div[3]/div[1]/button[1]"));
        loginBTN.click();
    }

    public static void TC_Login_002(){
        WebElement search = driver.findElement(By.id("APjFqb"));
        WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        loginbtn.click();
        search.clear();

    }


}
