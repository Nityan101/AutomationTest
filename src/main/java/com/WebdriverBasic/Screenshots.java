package com.WebdriverBasic;

import com.Base.BaseClass;
import javafx.scene.ImageCursor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Screenshots extends BaseClass {
    public static void main (String[] args) throws IOException {
        launch_browser("firefox");
        open_url("https://demo.opencart.com/");
       // getvisiblepartscreenshot("Image");
        //getfullpagescreenshot();

        HighlightElement();

    }

    public static void getfullpagescreenshot() throws IOException {

        //take shot
        Screenshot fullpage = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    // save
        ImageIO.write(fullpage.getImage(),"png",new File("./ScreenshotImages/fullpage.png"));

    }

    public static void HighlightElement() throws IOException {
        WebElement searchbox = driver.findElement(By.name("search"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //HighlightElement

        jse.executeAsyncScript("arguments[0].style.border='5px solid red'",searchbox);

        //screenshot
      //  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        Screenshot fullpage = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

        //save
        ImageIO.write(fullpage.getImage(),"png",new File("./src/ScreenshotImages/highlightelement.png"));


    }
}
