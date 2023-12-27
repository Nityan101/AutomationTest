package TestNG;

import org.hamcrest.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTestNG {
    public static WebDriver driver;

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
    @Test(description = "Email & password are valid")
    public static void Valid_TestCase(){
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("user101@gmail.com");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456789");

        WebElement loginBTN = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div[2]/div[1]/form/div[3]/div[1]/button[1]"));
        loginBTN.click();
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
    }
   }


