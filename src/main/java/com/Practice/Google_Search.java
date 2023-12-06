package com.Practice;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Google_Search extends BaseClass {

    public static void main(String[] args){
        chrome_launch();
        open_url("https://www.google.com/webhp?hl=bn&sa=X&ved=0ahUKEwilg4iqz_iCAxUQavUHHfCrCWoQPAgJ");
        TC_Login_002();
        driver.close();
    }

    public static void TC_Login_002(){
        WebElement search = driver.findElement(By.id("APjFqb"));
        WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        loginbtn.click();
        search.clear();


    }
}
