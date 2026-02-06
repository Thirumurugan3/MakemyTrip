package base;

import actionDriver.dataProviderClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass extends dataProviderClass {

    public static WebDriver driver;


    public static void launchBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");


    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
//        driver.quit();
    }

}
