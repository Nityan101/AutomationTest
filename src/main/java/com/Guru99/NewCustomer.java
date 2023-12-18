package com.Guru99;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomer extends BaseClass {
    public static void main (String[] args){
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

        WebElement newcust = driver.findElement(By.linkText("New Customer"));
        newcust.click();

        WebElement Custname = driver.findElement(By.name("name"));
        Custname.clear();
        Custname.sendKeys("Nityan Chakraborty");

        WebElement custgender = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
        custgender.click();


        //WebElement custgen = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
        //custgen.click();
       // WebElement CustGender = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]"));
       // CustGender.click();

        //WebElement CustomerGender = driver.findElement(By.name("rad1"));
        //CustomerGender.click();


        driver.findElement(By.id("dob")).click();
        driver.findElement(By.id("dob")).sendKeys("1995-09-01");

        WebElement CustAddress = driver.findElement(By.name("addr"));
        CustAddress.clear();
        CustAddress.sendKeys("Feni");

        WebElement Custcity = driver.findElement(By.name("city"));
        Custcity.clear();
        Custcity.sendKeys("Feni");

        WebElement Custstate = driver.findElement(By.name("state"));
        Custstate.clear();
        Custstate.sendKeys("Chittagong");

        WebElement pin = driver.findElement(By.name("pinno"));
        pin.clear();
        pin.sendKeys("632166");

        WebElement CustTeleph = driver.findElement(By.name("telephoneno"));
        CustTeleph.clear();
        CustTeleph.sendKeys("01515224450");

        WebElement CustEmail = driver.findElement(By.name("emailid"));
        CustEmail.clear();
        CustEmail.sendKeys("Nityancse14@gmail.com");

        WebElement SubmitBtn = driver.findElement(By.name("sub"));
        SubmitBtn.click();





    }

}
