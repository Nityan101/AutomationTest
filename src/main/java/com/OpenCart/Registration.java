package com.OpenCart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration extends BaseClass {
    public static void main(String[]args){
        launch_browser("firefox");
        //firefox_launch();
        open_url("https://demo.opencart.com/index.php?route=account/register");
        TC_Registration_001();
    }

    public static void TC_Registration_001(){



        WebElement fst_name = driver.findElement(By.id("input-firstname"));
        fst_name.clear();
        fst_name.sendKeys("Nityan");

        WebElement last_name = driver.findElement(By.id("input-lastname"));
        last_name.clear();
        last_name.sendKeys("CB");

        WebElement email = driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("nityan@cse.com");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));
        btn.click();

        WebElement myacc = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a"));
        myacc.click();

        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

    }

}
