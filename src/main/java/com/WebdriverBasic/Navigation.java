 package com.WebdriverBasic;

import com.Base.BaseClass;

public class Navigation extends BaseClass {

    public static void main(String[]  args) throws InterruptedException {
        firefox_launch();
        open_url("https://www.google.com/");
        navigate_to("https://demo.guru99.com/");
        Thread.sleep(2000);
        navigate_back();
        System.out.println(driver.getTitle());
        navigate_forward();
        System.out.println(driver.getTitle());
        firefox_close();

    }
    private static void navigate_back() {}

    private static void navigate_forward() {}

    public static void navigate_to(String url){
        driver.navigate().to(url);
    }
    public static void navigate_back(String url){
        driver.navigate().back();
    }
    public static void navigate_forward(String url){
        driver.navigate().forward();
    }
    public static void navigate_refresh(String url){
        driver.navigate().refresh();
    }

}
