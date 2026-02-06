package pom;


import actionDriver.actionClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends actionClass {

   public WebDriver driver;


    public homePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "q")
    WebElement search;

    @FindBy(xpath = "(//img[@class='UCc1lI']|//div[@class='p0C73x'])[2]")
    WebElement product;

    @FindBy(xpath = "(//div[@class='iCspr8 AF1m2F'])[1]")
    WebElement filter1;

    @FindBy(xpath = "(//label[@class='BMOCJ3 StZidb'])[1]")
    WebElement brand;



    public  void searchproduct(String prodct) throws InterruptedException {
        search.sendKeys(prodct, Keys.ENTER);
        Thread.sleep(2000);
//        Click(filter1);
        Thread.sleep(2000);
        Click(brand);
        Thread.sleep(2000);
        Click(product);
    }
}
