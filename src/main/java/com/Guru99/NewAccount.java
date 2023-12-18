package com.Guru99;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccount extends BaseClass {

    public static void main (String[] args) {
        launch_browser("firefox");
        open_url("https://demo.guru99.com/V1/index.php");
        TC_Login_001();
    }

public static void TC_Login_001() {

    WebElement user = driver.findElement(By.name("uid"));
    user.clear();
    user.sendKeys("mngr543177");

    WebElement Password = driver.findElement(By.name("password"));
    Password.clear();
    Password.sendKeys("ytAdUbu");

    WebElement loginBTN = driver.findElement(By.name("btnLogin"));
    loginBTN.click();

    //WebElement NewAcc = driver.findElement(By.xpath("//a[@title='My Account']"));
    WebElement element=driver.findElement(By.linkText("New Account"));
    element.click();


    WebElement Customer_id = driver.findElement(By.name("cusid"));
    Customer_id.clear();
    Customer_id.sendKeys("CID-0001");

    WebElement AccountTypeDropDown = driver.findElement(By.name("selaccount"));
    Select sel = new Select(AccountTypeDropDown);
    sel.selectByVisibleText("Current");

    WebElement InitDeposite = driver.findElement(By.name("inideposit"));
    InitDeposite.clear();
    InitDeposite.sendKeys("5000");


    WebElement button22 = driver.findElement(By.name("button2"));
    button22.click();


    }
}