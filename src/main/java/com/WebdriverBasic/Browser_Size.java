package com.WebdriverBasic;

import org.openqa.selenium.Dimension;

public class Browser_Size extends Browser{
    public static void main(String[] args){

        //firefox_launch();
        chrome_launch();
        get_browser_max_size();
        ipad();
       // chrome_close();
    }
    public static void get_browser_max_size(){
     int height= driver.manage().window().getSize().height;
     int width= driver.manage().window().getSize().width;

     System.out.println("Width: "+width+ "Height:"+height);
    }

    public static void ipad(){
        driver.manage().window().setSize(new Dimension(768,600));
        int height= driver.manage().window().getSize().height;
        int width= driver.manage().window().getSize().width;

        System.out.println("Ipad Width: "+width+ "Ipad Height:"+height);
    }
}
