package actionDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class actionClass extends dataProviderClass {
    public static WebDriver driver;
    static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));


    public static void Click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void windowhandle(){
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs=new ArrayList<>(windowHandles);
        for (String tab:tabs){
            driver.switchTo().window(tab);
        }
    }

    public static void jsScroll(int height){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,"+height+")");
    }

    public static void screenShot(String name) throws IOException {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File path= new File("target/Screenshots/"+name+".jpg");
        FileUtils.copyFile(screenshotAs,path);

    }


}
