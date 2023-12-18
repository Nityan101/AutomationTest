package com.WebdriverBasic;

import com.Base.BaseClass;

public class BasicAuthentication extends BaseClass {
    public static void main(String[] args){
       // firefox_launch();

        launch_browser("firefox");
        basic_auth();
        System.out.println(driver.getTitle());
    }
    public static void basic_auth()
    {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
