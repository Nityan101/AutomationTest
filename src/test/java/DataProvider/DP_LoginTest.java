package DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DP_LoginTest {

    public static WebDriver driver;

    //Extent report class
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports reports;
    public static ExtentTest test;


    @BeforeClass
    public static void befroreTest(){
        System.out.println("Before Test executed");
    }

    @AfterClass
    public static void AftereTest(){
        System.out.println("After Test executed");
    }

    @BeforeMethod
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
    }
    @AfterMethod
    public static void chrome_close(){

        driver.close();
    }
    @Test(dataProvider = "LoginData")
    public static void Valid_TestCase(String DP_Email, String DP_Pass){

        //Emplement extent repots

        htmlReporter = new ExtentHtmlReporter("./ExtentsReports/LoginTest.html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);

        // Information add to report
        reports.setSystemInfo("Project Name","Opencart");
        reports.setSystemInfo("Module Name","Login");
        reports.setSystemInfo("Browser","Chrome");
        reports.setSystemInfo("Tester Name","Nityan");

        test = reports.createTest("Login Test");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(DP_Email);
        test.log(Status.INFO,"Email Typing"+DP_Email);



        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys(DP_Pass);
        test.log(Status.INFO,"password Typing"+DP_Pass);

        WebElement loginBTN = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div[2]/div[1]/form/div[3]/div[1]/button[1]"));
        loginBTN.click();
        test.log(Status.INFO,"Login button Click");

        test.log(Status.PASS,"Test Passed");
    }

    @Test(description = "Email & password are Invalid")
    public static void Invalid_TestCase(){
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456789");

        WebElement loginBTN = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div[2]/div[1]/form/div[3]/div[1]/button[1]"));
        loginBTN.click();

        reports.flush();
    }

    @DataProvider(name = "LoginData")
    public Object [][] data(){

        Object [][] data = new Object[3][2];

        //set1
        data [0][0]="mail1@test.com";
        data [0][1]="123456789";

        //set2
        data [1][0]="mail2@test.com";
        data [1][1]="123456789";

        //set3
        data [2][0]="mail1@test.com";
        data [2][1]="123456789";


        return data;
    }

}








