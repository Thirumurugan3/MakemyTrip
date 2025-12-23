package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class baseClass {

    public static WebDriver driver;

    public static void browserLaunch(){
        driver=new ChromeDriver();
    }
    public static void Url(String url){
        driver.get(url);
    }
    public static void windowMaximize(){
        driver.manage().window().maximize();
    }
    public static void Click(WebElement element){
        element.click();
    }
    public static void singleClick(){
        Actions actions=new Actions(driver);
        actions.click().perform();
    }
    public static void wait(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
    public static void sendValues(WebElement element,String text){
        element.sendKeys(text);
    }
    public static void ESC(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();

    }
    public static void jsClick(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);
    }
    public static void jsScroll(int height){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+height+")");
    }
    public static void Scroll(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView",element);
    }
    public static void Slide(WebElement element,int offset){
        Actions action = new Actions(driver);
        action.clickAndHold(element).moveByOffset(0, offset).release().perform();
    }
    public static void keyPress() throws AWTException {
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_UP);
    }
    public static void keyRelease() throws AWTException {
        Robot robot=new Robot();
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
    }
    public static void elementScroll(WebElement element,int height){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop+"+height+";", element);
    }
    public static void Screenshots(String name) throws IOException {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File path= new File("target/Screenshots/"+name+".jpg");
        FileUtils.copyFile(screenshotAs,path);
    }


}
