package TestNG;

import org.testng.annotations.*;

public class TestNGBasic {

    @BeforeTest
    public static void browserconfig(){
        System.out.println("Browser config");
    }

    @AfterTest
    public static void closetest(){
        System.out.println("Browser Close");
    }

    @BeforeMethod
    public static void opentesturl(){
        System.out.println("Url launch");
    }

    @AfterMethod
    public static void Verification(){
        System.out.println("Verification Done!");
    }

    @Test
    public static void testcase_001 (){
        System.out.println("Test Testng 1");
    }

    @Test
    public static void testcase_002 (){
        System.out.println("Test Testng 2");
    }
}
