package com.WebdriverBasic;

import com.Base.BaseClass;

public class DynamicBrowser extends BaseClass {
    public static void main(String[] args){
        launch_browser("firefox");
        open_url("https://www.google.com/");
        browser_close("firefox");
    }

}
