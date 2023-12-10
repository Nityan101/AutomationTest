package com.WebdriverBasic;

import com.Base.BaseClass;

public class TitleUrlVerify extends BaseClass {
    public static void main(String[] args){
        firefox_launch();
        open_url("https://www.google.com/");
        title_verify();
        url_verify();
        firefox_close();

    }
    public static void title_verify(){
    String ActualTitle = driver.getTitle();
    String ExpectedTitle = "Google";
    if(ExpectedTitle.equals(ActualTitle)){
        System.out.println("Title Matched.Test Passed");
    }
        else{
        System.out.println("Title NotMatched.Test Failed!");
    }
    }

    public static void url_verify(){
        String Actualurl = driver.getTitle();
        String Expectedurl = "https://www.google.com/";
        if(Expectedurl.equals(Actualurl)){
            System.out.println("URL Matched.Test Passed");
        }
        else{
            System.out.println("URL NotMatched.Test Failed!");
        }

    }
}
