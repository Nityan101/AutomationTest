package com.WebdriverBasic;

public class Website_Launch extends  Browser{
     public static void main(String[] args){
        chrome_launch();
        firefox_launch();
         Open_url();
         //open_offline();
         chrome_close();
     }

     public static void Open_url(){

         driver.get("https://www.google.com");
     }

     public static void open_offline(){
         driver.get("file:///E:/SQA/demo cart/OpenCart - Demo.html");
         driver.get("http://127.0.0.1:8080/mypage.html");
     }

}
